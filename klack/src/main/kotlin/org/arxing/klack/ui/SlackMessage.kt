package org.arxing.klack.ui

import com.slack.api.methods.kotlin_extension.request.chat.blocks
import com.slack.api.methods.request.chat.ChatPostMessageRequest
import com.slack.api.model.Attachment
import com.slack.api.model.kotlin_extension.block.dsl.LayoutBlockDsl

data class SlackMessage2(
  val enableMarkdown: Boolean,

)


abstract class SlackMessage {

  open fun isEnableMarkdown(): Boolean = true

  open fun buildText(): String? = null

  open fun buildAttachments(): List<Attachment>? = null

  open fun buildAttachmentsJson(): String? = null

  open fun buildBlocks(): (LayoutBlockDsl.() -> Unit)? = null

  open fun buildBlocksJson(): String? = null

  open fun buildUsername(): String? = null

  fun toChatPostMessageRequest(
    token: String,
    channel: String,
    threadTs: String?,
  ): ChatPostMessageRequest {
    return ChatPostMessageRequest.builder()
      .token(token)
      .channel(channel)
      .threadTs(threadTs)
      .mrkdwn(isEnableMarkdown())
      .text(buildText())
      .attachments(buildAttachments())
      .attachmentsAsString(buildAttachmentsJson())
      .apply {
        buildBlocks()?.run { blocks(this) }
      }
      .blocksAsString(buildBlocksJson())
      .username(buildUsername())
      .build()
  }
}
