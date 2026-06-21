package com.vk.sdk.api.groups.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsLongPollEvents {

    @b("audio_new")
    @NotNull
    private final BaseBoolInt audioNew;

    @b("board_post_delete")
    @NotNull
    private final BaseBoolInt boardPostDelete;

    @b("board_post_edit")
    @NotNull
    private final BaseBoolInt boardPostEdit;

    @b("board_post_new")
    @NotNull
    private final BaseBoolInt boardPostNew;

    @b("board_post_restore")
    @NotNull
    private final BaseBoolInt boardPostRestore;

    @b("donut_money_withdraw")
    @NotNull
    private final BaseBoolInt donutMoneyWithdraw;

    @b("donut_money_withdraw_error")
    @NotNull
    private final BaseBoolInt donutMoneyWithdrawError;

    @b("donut_subscription_cancelled")
    @NotNull
    private final BaseBoolInt donutSubscriptionCancelled;

    @b("donut_subscription_create")
    @NotNull
    private final BaseBoolInt donutSubscriptionCreate;

    @b("donut_subscription_expired")
    @NotNull
    private final BaseBoolInt donutSubscriptionExpired;

    @b("donut_subscription_price_changed")
    @NotNull
    private final BaseBoolInt donutSubscriptionPriceChanged;

    @b("donut_subscription_prolonged")
    @NotNull
    private final BaseBoolInt donutSubscriptionProlonged;

    @b("group_change_photo")
    @NotNull
    private final BaseBoolInt groupChangePhoto;

    @b("group_change_settings")
    @NotNull
    private final BaseBoolInt groupChangeSettings;

    @b("group_join")
    @NotNull
    private final BaseBoolInt groupJoin;

    @b("group_leave")
    @NotNull
    private final BaseBoolInt groupLeave;

    @b("group_officers_edit")
    @NotNull
    private final BaseBoolInt groupOfficersEdit;

    @b("lead_forms_new")
    @Nullable
    private final BaseBoolInt leadFormsNew;

    @b("market_comment_delete")
    @NotNull
    private final BaseBoolInt marketCommentDelete;

    @b("market_comment_edit")
    @NotNull
    private final BaseBoolInt marketCommentEdit;

    @b("market_comment_new")
    @NotNull
    private final BaseBoolInt marketCommentNew;

    @b("market_comment_restore")
    @NotNull
    private final BaseBoolInt marketCommentRestore;

    @b("market_order_edit")
    @Nullable
    private final BaseBoolInt marketOrderEdit;

    @b("market_order_new")
    @Nullable
    private final BaseBoolInt marketOrderNew;

    @b("message_allow")
    @NotNull
    private final BaseBoolInt messageAllow;

    @b("message_deny")
    @NotNull
    private final BaseBoolInt messageDeny;

    @b("message_edit")
    @NotNull
    private final BaseBoolInt messageEdit;

    @b("message_new")
    @NotNull
    private final BaseBoolInt messageNew;

    @b("message_read")
    @NotNull
    private final BaseBoolInt messageRead;

    @b("message_reply")
    @NotNull
    private final BaseBoolInt messageReply;

    @b("message_typing_state")
    @NotNull
    private final BaseBoolInt messageTypingState;

    @b("photo_comment_delete")
    @NotNull
    private final BaseBoolInt photoCommentDelete;

    @b("photo_comment_edit")
    @NotNull
    private final BaseBoolInt photoCommentEdit;

    @b("photo_comment_new")
    @NotNull
    private final BaseBoolInt photoCommentNew;

    @b("photo_comment_restore")
    @NotNull
    private final BaseBoolInt photoCommentRestore;

    @b("photo_new")
    @NotNull
    private final BaseBoolInt photoNew;

    @b("poll_vote_new")
    @NotNull
    private final BaseBoolInt pollVoteNew;

    @b("user_block")
    @NotNull
    private final BaseBoolInt userBlock;

    @b("user_unblock")
    @NotNull
    private final BaseBoolInt userUnblock;

    @b("video_comment_delete")
    @NotNull
    private final BaseBoolInt videoCommentDelete;

    @b("video_comment_edit")
    @NotNull
    private final BaseBoolInt videoCommentEdit;

    @b("video_comment_new")
    @NotNull
    private final BaseBoolInt videoCommentNew;

    @b("video_comment_restore")
    @NotNull
    private final BaseBoolInt videoCommentRestore;

    @b("video_new")
    @NotNull
    private final BaseBoolInt videoNew;

    @b("wall_post_new")
    @NotNull
    private final BaseBoolInt wallPostNew;

    @b("wall_reply_delete")
    @NotNull
    private final BaseBoolInt wallReplyDelete;

    @b("wall_reply_edit")
    @NotNull
    private final BaseBoolInt wallReplyEdit;

    @b("wall_reply_new")
    @NotNull
    private final BaseBoolInt wallReplyNew;

    @b("wall_reply_restore")
    @NotNull
    private final BaseBoolInt wallReplyRestore;

    @b("wall_repost")
    @NotNull
    private final BaseBoolInt wallRepost;

    public GroupsLongPollEvents(@NotNull BaseBoolInt audioNew, @NotNull BaseBoolInt boardPostDelete, @NotNull BaseBoolInt boardPostEdit, @NotNull BaseBoolInt boardPostNew, @NotNull BaseBoolInt boardPostRestore, @NotNull BaseBoolInt groupChangePhoto, @NotNull BaseBoolInt groupChangeSettings, @NotNull BaseBoolInt groupJoin, @NotNull BaseBoolInt groupLeave, @NotNull BaseBoolInt groupOfficersEdit, @NotNull BaseBoolInt marketCommentDelete, @NotNull BaseBoolInt marketCommentEdit, @NotNull BaseBoolInt marketCommentNew, @NotNull BaseBoolInt marketCommentRestore, @NotNull BaseBoolInt messageAllow, @NotNull BaseBoolInt messageDeny, @NotNull BaseBoolInt messageNew, @NotNull BaseBoolInt messageRead, @NotNull BaseBoolInt messageReply, @NotNull BaseBoolInt messageTypingState, @NotNull BaseBoolInt messageEdit, @NotNull BaseBoolInt photoCommentDelete, @NotNull BaseBoolInt photoCommentEdit, @NotNull BaseBoolInt photoCommentNew, @NotNull BaseBoolInt photoCommentRestore, @NotNull BaseBoolInt photoNew, @NotNull BaseBoolInt pollVoteNew, @NotNull BaseBoolInt userBlock, @NotNull BaseBoolInt userUnblock, @NotNull BaseBoolInt videoCommentDelete, @NotNull BaseBoolInt videoCommentEdit, @NotNull BaseBoolInt videoCommentNew, @NotNull BaseBoolInt videoCommentRestore, @NotNull BaseBoolInt videoNew, @NotNull BaseBoolInt wallPostNew, @NotNull BaseBoolInt wallReplyDelete, @NotNull BaseBoolInt wallReplyEdit, @NotNull BaseBoolInt wallReplyNew, @NotNull BaseBoolInt wallReplyRestore, @NotNull BaseBoolInt wallRepost, @NotNull BaseBoolInt donutSubscriptionCreate, @NotNull BaseBoolInt donutSubscriptionProlonged, @NotNull BaseBoolInt donutSubscriptionCancelled, @NotNull BaseBoolInt donutSubscriptionExpired, @NotNull BaseBoolInt donutSubscriptionPriceChanged, @NotNull BaseBoolInt donutMoneyWithdraw, @NotNull BaseBoolInt donutMoneyWithdrawError, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3) {
        Intrinsics.checkNotNullParameter(audioNew, "audioNew");
        Intrinsics.checkNotNullParameter(boardPostDelete, "boardPostDelete");
        Intrinsics.checkNotNullParameter(boardPostEdit, "boardPostEdit");
        Intrinsics.checkNotNullParameter(boardPostNew, "boardPostNew");
        Intrinsics.checkNotNullParameter(boardPostRestore, "boardPostRestore");
        Intrinsics.checkNotNullParameter(groupChangePhoto, "groupChangePhoto");
        Intrinsics.checkNotNullParameter(groupChangeSettings, "groupChangeSettings");
        Intrinsics.checkNotNullParameter(groupJoin, "groupJoin");
        Intrinsics.checkNotNullParameter(groupLeave, "groupLeave");
        Intrinsics.checkNotNullParameter(groupOfficersEdit, "groupOfficersEdit");
        Intrinsics.checkNotNullParameter(marketCommentDelete, "marketCommentDelete");
        Intrinsics.checkNotNullParameter(marketCommentEdit, "marketCommentEdit");
        Intrinsics.checkNotNullParameter(marketCommentNew, "marketCommentNew");
        Intrinsics.checkNotNullParameter(marketCommentRestore, "marketCommentRestore");
        Intrinsics.checkNotNullParameter(messageAllow, "messageAllow");
        Intrinsics.checkNotNullParameter(messageDeny, "messageDeny");
        Intrinsics.checkNotNullParameter(messageNew, "messageNew");
        Intrinsics.checkNotNullParameter(messageRead, "messageRead");
        Intrinsics.checkNotNullParameter(messageReply, "messageReply");
        Intrinsics.checkNotNullParameter(messageTypingState, "messageTypingState");
        Intrinsics.checkNotNullParameter(messageEdit, "messageEdit");
        Intrinsics.checkNotNullParameter(photoCommentDelete, "photoCommentDelete");
        Intrinsics.checkNotNullParameter(photoCommentEdit, "photoCommentEdit");
        Intrinsics.checkNotNullParameter(photoCommentNew, "photoCommentNew");
        Intrinsics.checkNotNullParameter(photoCommentRestore, "photoCommentRestore");
        Intrinsics.checkNotNullParameter(photoNew, "photoNew");
        Intrinsics.checkNotNullParameter(pollVoteNew, "pollVoteNew");
        Intrinsics.checkNotNullParameter(userBlock, "userBlock");
        Intrinsics.checkNotNullParameter(userUnblock, "userUnblock");
        Intrinsics.checkNotNullParameter(videoCommentDelete, "videoCommentDelete");
        Intrinsics.checkNotNullParameter(videoCommentEdit, "videoCommentEdit");
        Intrinsics.checkNotNullParameter(videoCommentNew, "videoCommentNew");
        Intrinsics.checkNotNullParameter(videoCommentRestore, "videoCommentRestore");
        Intrinsics.checkNotNullParameter(videoNew, "videoNew");
        Intrinsics.checkNotNullParameter(wallPostNew, "wallPostNew");
        Intrinsics.checkNotNullParameter(wallReplyDelete, "wallReplyDelete");
        Intrinsics.checkNotNullParameter(wallReplyEdit, "wallReplyEdit");
        Intrinsics.checkNotNullParameter(wallReplyNew, "wallReplyNew");
        Intrinsics.checkNotNullParameter(wallReplyRestore, "wallReplyRestore");
        Intrinsics.checkNotNullParameter(wallRepost, "wallRepost");
        Intrinsics.checkNotNullParameter(donutSubscriptionCreate, "donutSubscriptionCreate");
        Intrinsics.checkNotNullParameter(donutSubscriptionProlonged, "donutSubscriptionProlonged");
        Intrinsics.checkNotNullParameter(donutSubscriptionCancelled, "donutSubscriptionCancelled");
        Intrinsics.checkNotNullParameter(donutSubscriptionExpired, "donutSubscriptionExpired");
        Intrinsics.checkNotNullParameter(donutSubscriptionPriceChanged, "donutSubscriptionPriceChanged");
        Intrinsics.checkNotNullParameter(donutMoneyWithdraw, "donutMoneyWithdraw");
        Intrinsics.checkNotNullParameter(donutMoneyWithdrawError, "donutMoneyWithdrawError");
        this.audioNew = audioNew;
        this.boardPostDelete = boardPostDelete;
        this.boardPostEdit = boardPostEdit;
        this.boardPostNew = boardPostNew;
        this.boardPostRestore = boardPostRestore;
        this.groupChangePhoto = groupChangePhoto;
        this.groupChangeSettings = groupChangeSettings;
        this.groupJoin = groupJoin;
        this.groupLeave = groupLeave;
        this.groupOfficersEdit = groupOfficersEdit;
        this.marketCommentDelete = marketCommentDelete;
        this.marketCommentEdit = marketCommentEdit;
        this.marketCommentNew = marketCommentNew;
        this.marketCommentRestore = marketCommentRestore;
        this.messageAllow = messageAllow;
        this.messageDeny = messageDeny;
        this.messageNew = messageNew;
        this.messageRead = messageRead;
        this.messageReply = messageReply;
        this.messageTypingState = messageTypingState;
        this.messageEdit = messageEdit;
        this.photoCommentDelete = photoCommentDelete;
        this.photoCommentEdit = photoCommentEdit;
        this.photoCommentNew = photoCommentNew;
        this.photoCommentRestore = photoCommentRestore;
        this.photoNew = photoNew;
        this.pollVoteNew = pollVoteNew;
        this.userBlock = userBlock;
        this.userUnblock = userUnblock;
        this.videoCommentDelete = videoCommentDelete;
        this.videoCommentEdit = videoCommentEdit;
        this.videoCommentNew = videoCommentNew;
        this.videoCommentRestore = videoCommentRestore;
        this.videoNew = videoNew;
        this.wallPostNew = wallPostNew;
        this.wallReplyDelete = wallReplyDelete;
        this.wallReplyEdit = wallReplyEdit;
        this.wallReplyNew = wallReplyNew;
        this.wallReplyRestore = wallReplyRestore;
        this.wallRepost = wallRepost;
        this.donutSubscriptionCreate = donutSubscriptionCreate;
        this.donutSubscriptionProlonged = donutSubscriptionProlonged;
        this.donutSubscriptionCancelled = donutSubscriptionCancelled;
        this.donutSubscriptionExpired = donutSubscriptionExpired;
        this.donutSubscriptionPriceChanged = donutSubscriptionPriceChanged;
        this.donutMoneyWithdraw = donutMoneyWithdraw;
        this.donutMoneyWithdrawError = donutMoneyWithdrawError;
        this.leadFormsNew = baseBoolInt;
        this.marketOrderNew = baseBoolInt2;
        this.marketOrderEdit = baseBoolInt3;
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.audioNew;
    }

    @NotNull
    public final BaseBoolInt component10() {
        return this.groupOfficersEdit;
    }

    @NotNull
    public final BaseBoolInt component11() {
        return this.marketCommentDelete;
    }

    @NotNull
    public final BaseBoolInt component12() {
        return this.marketCommentEdit;
    }

    @NotNull
    public final BaseBoolInt component13() {
        return this.marketCommentNew;
    }

    @NotNull
    public final BaseBoolInt component14() {
        return this.marketCommentRestore;
    }

    @NotNull
    public final BaseBoolInt component15() {
        return this.messageAllow;
    }

    @NotNull
    public final BaseBoolInt component16() {
        return this.messageDeny;
    }

    @NotNull
    public final BaseBoolInt component17() {
        return this.messageNew;
    }

    @NotNull
    public final BaseBoolInt component18() {
        return this.messageRead;
    }

    @NotNull
    public final BaseBoolInt component19() {
        return this.messageReply;
    }

    @NotNull
    public final BaseBoolInt component2() {
        return this.boardPostDelete;
    }

    @NotNull
    public final BaseBoolInt component20() {
        return this.messageTypingState;
    }

    @NotNull
    public final BaseBoolInt component21() {
        return this.messageEdit;
    }

    @NotNull
    public final BaseBoolInt component22() {
        return this.photoCommentDelete;
    }

    @NotNull
    public final BaseBoolInt component23() {
        return this.photoCommentEdit;
    }

    @NotNull
    public final BaseBoolInt component24() {
        return this.photoCommentNew;
    }

    @NotNull
    public final BaseBoolInt component25() {
        return this.photoCommentRestore;
    }

    @NotNull
    public final BaseBoolInt component26() {
        return this.photoNew;
    }

    @NotNull
    public final BaseBoolInt component27() {
        return this.pollVoteNew;
    }

    @NotNull
    public final BaseBoolInt component28() {
        return this.userBlock;
    }

    @NotNull
    public final BaseBoolInt component29() {
        return this.userUnblock;
    }

    @NotNull
    public final BaseBoolInt component3() {
        return this.boardPostEdit;
    }

    @NotNull
    public final BaseBoolInt component30() {
        return this.videoCommentDelete;
    }

    @NotNull
    public final BaseBoolInt component31() {
        return this.videoCommentEdit;
    }

    @NotNull
    public final BaseBoolInt component32() {
        return this.videoCommentNew;
    }

    @NotNull
    public final BaseBoolInt component33() {
        return this.videoCommentRestore;
    }

    @NotNull
    public final BaseBoolInt component34() {
        return this.videoNew;
    }

    @NotNull
    public final BaseBoolInt component35() {
        return this.wallPostNew;
    }

    @NotNull
    public final BaseBoolInt component36() {
        return this.wallReplyDelete;
    }

    @NotNull
    public final BaseBoolInt component37() {
        return this.wallReplyEdit;
    }

    @NotNull
    public final BaseBoolInt component38() {
        return this.wallReplyNew;
    }

    @NotNull
    public final BaseBoolInt component39() {
        return this.wallReplyRestore;
    }

    @NotNull
    public final BaseBoolInt component4() {
        return this.boardPostNew;
    }

    @NotNull
    public final BaseBoolInt component40() {
        return this.wallRepost;
    }

    @NotNull
    public final BaseBoolInt component41() {
        return this.donutSubscriptionCreate;
    }

    @NotNull
    public final BaseBoolInt component42() {
        return this.donutSubscriptionProlonged;
    }

    @NotNull
    public final BaseBoolInt component43() {
        return this.donutSubscriptionCancelled;
    }

    @NotNull
    public final BaseBoolInt component44() {
        return this.donutSubscriptionExpired;
    }

    @NotNull
    public final BaseBoolInt component45() {
        return this.donutSubscriptionPriceChanged;
    }

    @NotNull
    public final BaseBoolInt component46() {
        return this.donutMoneyWithdraw;
    }

    @NotNull
    public final BaseBoolInt component47() {
        return this.donutMoneyWithdrawError;
    }

    @Nullable
    public final BaseBoolInt component48() {
        return this.leadFormsNew;
    }

    @Nullable
    public final BaseBoolInt component49() {
        return this.marketOrderNew;
    }

    @NotNull
    public final BaseBoolInt component5() {
        return this.boardPostRestore;
    }

    @Nullable
    public final BaseBoolInt component50() {
        return this.marketOrderEdit;
    }

    @NotNull
    public final BaseBoolInt component6() {
        return this.groupChangePhoto;
    }

    @NotNull
    public final BaseBoolInt component7() {
        return this.groupChangeSettings;
    }

    @NotNull
    public final BaseBoolInt component8() {
        return this.groupJoin;
    }

    @NotNull
    public final BaseBoolInt component9() {
        return this.groupLeave;
    }

    @NotNull
    public final GroupsLongPollEvents copy(@NotNull BaseBoolInt audioNew, @NotNull BaseBoolInt boardPostDelete, @NotNull BaseBoolInt boardPostEdit, @NotNull BaseBoolInt boardPostNew, @NotNull BaseBoolInt boardPostRestore, @NotNull BaseBoolInt groupChangePhoto, @NotNull BaseBoolInt groupChangeSettings, @NotNull BaseBoolInt groupJoin, @NotNull BaseBoolInt groupLeave, @NotNull BaseBoolInt groupOfficersEdit, @NotNull BaseBoolInt marketCommentDelete, @NotNull BaseBoolInt marketCommentEdit, @NotNull BaseBoolInt marketCommentNew, @NotNull BaseBoolInt marketCommentRestore, @NotNull BaseBoolInt messageAllow, @NotNull BaseBoolInt messageDeny, @NotNull BaseBoolInt messageNew, @NotNull BaseBoolInt messageRead, @NotNull BaseBoolInt messageReply, @NotNull BaseBoolInt messageTypingState, @NotNull BaseBoolInt messageEdit, @NotNull BaseBoolInt photoCommentDelete, @NotNull BaseBoolInt photoCommentEdit, @NotNull BaseBoolInt photoCommentNew, @NotNull BaseBoolInt photoCommentRestore, @NotNull BaseBoolInt photoNew, @NotNull BaseBoolInt pollVoteNew, @NotNull BaseBoolInt userBlock, @NotNull BaseBoolInt userUnblock, @NotNull BaseBoolInt videoCommentDelete, @NotNull BaseBoolInt videoCommentEdit, @NotNull BaseBoolInt videoCommentNew, @NotNull BaseBoolInt videoCommentRestore, @NotNull BaseBoolInt videoNew, @NotNull BaseBoolInt wallPostNew, @NotNull BaseBoolInt wallReplyDelete, @NotNull BaseBoolInt wallReplyEdit, @NotNull BaseBoolInt wallReplyNew, @NotNull BaseBoolInt wallReplyRestore, @NotNull BaseBoolInt wallRepost, @NotNull BaseBoolInt donutSubscriptionCreate, @NotNull BaseBoolInt donutSubscriptionProlonged, @NotNull BaseBoolInt donutSubscriptionCancelled, @NotNull BaseBoolInt donutSubscriptionExpired, @NotNull BaseBoolInt donutSubscriptionPriceChanged, @NotNull BaseBoolInt donutMoneyWithdraw, @NotNull BaseBoolInt donutMoneyWithdrawError, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2, @Nullable BaseBoolInt baseBoolInt3) {
        Intrinsics.checkNotNullParameter(audioNew, "audioNew");
        Intrinsics.checkNotNullParameter(boardPostDelete, "boardPostDelete");
        Intrinsics.checkNotNullParameter(boardPostEdit, "boardPostEdit");
        Intrinsics.checkNotNullParameter(boardPostNew, "boardPostNew");
        Intrinsics.checkNotNullParameter(boardPostRestore, "boardPostRestore");
        Intrinsics.checkNotNullParameter(groupChangePhoto, "groupChangePhoto");
        Intrinsics.checkNotNullParameter(groupChangeSettings, "groupChangeSettings");
        Intrinsics.checkNotNullParameter(groupJoin, "groupJoin");
        Intrinsics.checkNotNullParameter(groupLeave, "groupLeave");
        Intrinsics.checkNotNullParameter(groupOfficersEdit, "groupOfficersEdit");
        Intrinsics.checkNotNullParameter(marketCommentDelete, "marketCommentDelete");
        Intrinsics.checkNotNullParameter(marketCommentEdit, "marketCommentEdit");
        Intrinsics.checkNotNullParameter(marketCommentNew, "marketCommentNew");
        Intrinsics.checkNotNullParameter(marketCommentRestore, "marketCommentRestore");
        Intrinsics.checkNotNullParameter(messageAllow, "messageAllow");
        Intrinsics.checkNotNullParameter(messageDeny, "messageDeny");
        Intrinsics.checkNotNullParameter(messageNew, "messageNew");
        Intrinsics.checkNotNullParameter(messageRead, "messageRead");
        Intrinsics.checkNotNullParameter(messageReply, "messageReply");
        Intrinsics.checkNotNullParameter(messageTypingState, "messageTypingState");
        Intrinsics.checkNotNullParameter(messageEdit, "messageEdit");
        Intrinsics.checkNotNullParameter(photoCommentDelete, "photoCommentDelete");
        Intrinsics.checkNotNullParameter(photoCommentEdit, "photoCommentEdit");
        Intrinsics.checkNotNullParameter(photoCommentNew, "photoCommentNew");
        Intrinsics.checkNotNullParameter(photoCommentRestore, "photoCommentRestore");
        Intrinsics.checkNotNullParameter(photoNew, "photoNew");
        Intrinsics.checkNotNullParameter(pollVoteNew, "pollVoteNew");
        Intrinsics.checkNotNullParameter(userBlock, "userBlock");
        Intrinsics.checkNotNullParameter(userUnblock, "userUnblock");
        Intrinsics.checkNotNullParameter(videoCommentDelete, "videoCommentDelete");
        Intrinsics.checkNotNullParameter(videoCommentEdit, "videoCommentEdit");
        Intrinsics.checkNotNullParameter(videoCommentNew, "videoCommentNew");
        Intrinsics.checkNotNullParameter(videoCommentRestore, "videoCommentRestore");
        Intrinsics.checkNotNullParameter(videoNew, "videoNew");
        Intrinsics.checkNotNullParameter(wallPostNew, "wallPostNew");
        Intrinsics.checkNotNullParameter(wallReplyDelete, "wallReplyDelete");
        Intrinsics.checkNotNullParameter(wallReplyEdit, "wallReplyEdit");
        Intrinsics.checkNotNullParameter(wallReplyNew, "wallReplyNew");
        Intrinsics.checkNotNullParameter(wallReplyRestore, "wallReplyRestore");
        Intrinsics.checkNotNullParameter(wallRepost, "wallRepost");
        Intrinsics.checkNotNullParameter(donutSubscriptionCreate, "donutSubscriptionCreate");
        Intrinsics.checkNotNullParameter(donutSubscriptionProlonged, "donutSubscriptionProlonged");
        Intrinsics.checkNotNullParameter(donutSubscriptionCancelled, "donutSubscriptionCancelled");
        Intrinsics.checkNotNullParameter(donutSubscriptionExpired, "donutSubscriptionExpired");
        Intrinsics.checkNotNullParameter(donutSubscriptionPriceChanged, "donutSubscriptionPriceChanged");
        Intrinsics.checkNotNullParameter(donutMoneyWithdraw, "donutMoneyWithdraw");
        Intrinsics.checkNotNullParameter(donutMoneyWithdrawError, "donutMoneyWithdrawError");
        return new GroupsLongPollEvents(audioNew, boardPostDelete, boardPostEdit, boardPostNew, boardPostRestore, groupChangePhoto, groupChangeSettings, groupJoin, groupLeave, groupOfficersEdit, marketCommentDelete, marketCommentEdit, marketCommentNew, marketCommentRestore, messageAllow, messageDeny, messageNew, messageRead, messageReply, messageTypingState, messageEdit, photoCommentDelete, photoCommentEdit, photoCommentNew, photoCommentRestore, photoNew, pollVoteNew, userBlock, userUnblock, videoCommentDelete, videoCommentEdit, videoCommentNew, videoCommentRestore, videoNew, wallPostNew, wallReplyDelete, wallReplyEdit, wallReplyNew, wallReplyRestore, wallRepost, donutSubscriptionCreate, donutSubscriptionProlonged, donutSubscriptionCancelled, donutSubscriptionExpired, donutSubscriptionPriceChanged, donutMoneyWithdraw, donutMoneyWithdrawError, baseBoolInt, baseBoolInt2, baseBoolInt3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollEvents)) {
            return false;
        }
        GroupsLongPollEvents groupsLongPollEvents = (GroupsLongPollEvents) obj;
        return this.audioNew == groupsLongPollEvents.audioNew && this.boardPostDelete == groupsLongPollEvents.boardPostDelete && this.boardPostEdit == groupsLongPollEvents.boardPostEdit && this.boardPostNew == groupsLongPollEvents.boardPostNew && this.boardPostRestore == groupsLongPollEvents.boardPostRestore && this.groupChangePhoto == groupsLongPollEvents.groupChangePhoto && this.groupChangeSettings == groupsLongPollEvents.groupChangeSettings && this.groupJoin == groupsLongPollEvents.groupJoin && this.groupLeave == groupsLongPollEvents.groupLeave && this.groupOfficersEdit == groupsLongPollEvents.groupOfficersEdit && this.marketCommentDelete == groupsLongPollEvents.marketCommentDelete && this.marketCommentEdit == groupsLongPollEvents.marketCommentEdit && this.marketCommentNew == groupsLongPollEvents.marketCommentNew && this.marketCommentRestore == groupsLongPollEvents.marketCommentRestore && this.messageAllow == groupsLongPollEvents.messageAllow && this.messageDeny == groupsLongPollEvents.messageDeny && this.messageNew == groupsLongPollEvents.messageNew && this.messageRead == groupsLongPollEvents.messageRead && this.messageReply == groupsLongPollEvents.messageReply && this.messageTypingState == groupsLongPollEvents.messageTypingState && this.messageEdit == groupsLongPollEvents.messageEdit && this.photoCommentDelete == groupsLongPollEvents.photoCommentDelete && this.photoCommentEdit == groupsLongPollEvents.photoCommentEdit && this.photoCommentNew == groupsLongPollEvents.photoCommentNew && this.photoCommentRestore == groupsLongPollEvents.photoCommentRestore && this.photoNew == groupsLongPollEvents.photoNew && this.pollVoteNew == groupsLongPollEvents.pollVoteNew && this.userBlock == groupsLongPollEvents.userBlock && this.userUnblock == groupsLongPollEvents.userUnblock && this.videoCommentDelete == groupsLongPollEvents.videoCommentDelete && this.videoCommentEdit == groupsLongPollEvents.videoCommentEdit && this.videoCommentNew == groupsLongPollEvents.videoCommentNew && this.videoCommentRestore == groupsLongPollEvents.videoCommentRestore && this.videoNew == groupsLongPollEvents.videoNew && this.wallPostNew == groupsLongPollEvents.wallPostNew && this.wallReplyDelete == groupsLongPollEvents.wallReplyDelete && this.wallReplyEdit == groupsLongPollEvents.wallReplyEdit && this.wallReplyNew == groupsLongPollEvents.wallReplyNew && this.wallReplyRestore == groupsLongPollEvents.wallReplyRestore && this.wallRepost == groupsLongPollEvents.wallRepost && this.donutSubscriptionCreate == groupsLongPollEvents.donutSubscriptionCreate && this.donutSubscriptionProlonged == groupsLongPollEvents.donutSubscriptionProlonged && this.donutSubscriptionCancelled == groupsLongPollEvents.donutSubscriptionCancelled && this.donutSubscriptionExpired == groupsLongPollEvents.donutSubscriptionExpired && this.donutSubscriptionPriceChanged == groupsLongPollEvents.donutSubscriptionPriceChanged && this.donutMoneyWithdraw == groupsLongPollEvents.donutMoneyWithdraw && this.donutMoneyWithdrawError == groupsLongPollEvents.donutMoneyWithdrawError && this.leadFormsNew == groupsLongPollEvents.leadFormsNew && this.marketOrderNew == groupsLongPollEvents.marketOrderNew && this.marketOrderEdit == groupsLongPollEvents.marketOrderEdit;
    }

    @NotNull
    public final BaseBoolInt getAudioNew() {
        return this.audioNew;
    }

    @NotNull
    public final BaseBoolInt getBoardPostDelete() {
        return this.boardPostDelete;
    }

    @NotNull
    public final BaseBoolInt getBoardPostEdit() {
        return this.boardPostEdit;
    }

    @NotNull
    public final BaseBoolInt getBoardPostNew() {
        return this.boardPostNew;
    }

    @NotNull
    public final BaseBoolInt getBoardPostRestore() {
        return this.boardPostRestore;
    }

    @NotNull
    public final BaseBoolInt getDonutMoneyWithdraw() {
        return this.donutMoneyWithdraw;
    }

    @NotNull
    public final BaseBoolInt getDonutMoneyWithdrawError() {
        return this.donutMoneyWithdrawError;
    }

    @NotNull
    public final BaseBoolInt getDonutSubscriptionCancelled() {
        return this.donutSubscriptionCancelled;
    }

    @NotNull
    public final BaseBoolInt getDonutSubscriptionCreate() {
        return this.donutSubscriptionCreate;
    }

    @NotNull
    public final BaseBoolInt getDonutSubscriptionExpired() {
        return this.donutSubscriptionExpired;
    }

    @NotNull
    public final BaseBoolInt getDonutSubscriptionPriceChanged() {
        return this.donutSubscriptionPriceChanged;
    }

    @NotNull
    public final BaseBoolInt getDonutSubscriptionProlonged() {
        return this.donutSubscriptionProlonged;
    }

    @NotNull
    public final BaseBoolInt getGroupChangePhoto() {
        return this.groupChangePhoto;
    }

    @NotNull
    public final BaseBoolInt getGroupChangeSettings() {
        return this.groupChangeSettings;
    }

    @NotNull
    public final BaseBoolInt getGroupJoin() {
        return this.groupJoin;
    }

    @NotNull
    public final BaseBoolInt getGroupLeave() {
        return this.groupLeave;
    }

    @NotNull
    public final BaseBoolInt getGroupOfficersEdit() {
        return this.groupOfficersEdit;
    }

    @Nullable
    public final BaseBoolInt getLeadFormsNew() {
        return this.leadFormsNew;
    }

    @NotNull
    public final BaseBoolInt getMarketCommentDelete() {
        return this.marketCommentDelete;
    }

    @NotNull
    public final BaseBoolInt getMarketCommentEdit() {
        return this.marketCommentEdit;
    }

    @NotNull
    public final BaseBoolInt getMarketCommentNew() {
        return this.marketCommentNew;
    }

    @NotNull
    public final BaseBoolInt getMarketCommentRestore() {
        return this.marketCommentRestore;
    }

    @Nullable
    public final BaseBoolInt getMarketOrderEdit() {
        return this.marketOrderEdit;
    }

    @Nullable
    public final BaseBoolInt getMarketOrderNew() {
        return this.marketOrderNew;
    }

    @NotNull
    public final BaseBoolInt getMessageAllow() {
        return this.messageAllow;
    }

    @NotNull
    public final BaseBoolInt getMessageDeny() {
        return this.messageDeny;
    }

    @NotNull
    public final BaseBoolInt getMessageEdit() {
        return this.messageEdit;
    }

    @NotNull
    public final BaseBoolInt getMessageNew() {
        return this.messageNew;
    }

    @NotNull
    public final BaseBoolInt getMessageRead() {
        return this.messageRead;
    }

    @NotNull
    public final BaseBoolInt getMessageReply() {
        return this.messageReply;
    }

    @NotNull
    public final BaseBoolInt getMessageTypingState() {
        return this.messageTypingState;
    }

    @NotNull
    public final BaseBoolInt getPhotoCommentDelete() {
        return this.photoCommentDelete;
    }

    @NotNull
    public final BaseBoolInt getPhotoCommentEdit() {
        return this.photoCommentEdit;
    }

    @NotNull
    public final BaseBoolInt getPhotoCommentNew() {
        return this.photoCommentNew;
    }

    @NotNull
    public final BaseBoolInt getPhotoCommentRestore() {
        return this.photoCommentRestore;
    }

    @NotNull
    public final BaseBoolInt getPhotoNew() {
        return this.photoNew;
    }

    @NotNull
    public final BaseBoolInt getPollVoteNew() {
        return this.pollVoteNew;
    }

    @NotNull
    public final BaseBoolInt getUserBlock() {
        return this.userBlock;
    }

    @NotNull
    public final BaseBoolInt getUserUnblock() {
        return this.userUnblock;
    }

    @NotNull
    public final BaseBoolInt getVideoCommentDelete() {
        return this.videoCommentDelete;
    }

    @NotNull
    public final BaseBoolInt getVideoCommentEdit() {
        return this.videoCommentEdit;
    }

    @NotNull
    public final BaseBoolInt getVideoCommentNew() {
        return this.videoCommentNew;
    }

    @NotNull
    public final BaseBoolInt getVideoCommentRestore() {
        return this.videoCommentRestore;
    }

    @NotNull
    public final BaseBoolInt getVideoNew() {
        return this.videoNew;
    }

    @NotNull
    public final BaseBoolInt getWallPostNew() {
        return this.wallPostNew;
    }

    @NotNull
    public final BaseBoolInt getWallReplyDelete() {
        return this.wallReplyDelete;
    }

    @NotNull
    public final BaseBoolInt getWallReplyEdit() {
        return this.wallReplyEdit;
    }

    @NotNull
    public final BaseBoolInt getWallReplyNew() {
        return this.wallReplyNew;
    }

    @NotNull
    public final BaseBoolInt getWallReplyRestore() {
        return this.wallReplyRestore;
    }

    @NotNull
    public final BaseBoolInt getWallRepost() {
        return this.wallRepost;
    }

    public int hashCode() {
        int iF = a.f(this.donutMoneyWithdrawError, a.f(this.donutMoneyWithdraw, a.f(this.donutSubscriptionPriceChanged, a.f(this.donutSubscriptionExpired, a.f(this.donutSubscriptionCancelled, a.f(this.donutSubscriptionProlonged, a.f(this.donutSubscriptionCreate, a.f(this.wallRepost, a.f(this.wallReplyRestore, a.f(this.wallReplyNew, a.f(this.wallReplyEdit, a.f(this.wallReplyDelete, a.f(this.wallPostNew, a.f(this.videoNew, a.f(this.videoCommentRestore, a.f(this.videoCommentNew, a.f(this.videoCommentEdit, a.f(this.videoCommentDelete, a.f(this.userUnblock, a.f(this.userBlock, a.f(this.pollVoteNew, a.f(this.photoNew, a.f(this.photoCommentRestore, a.f(this.photoCommentNew, a.f(this.photoCommentEdit, a.f(this.photoCommentDelete, a.f(this.messageEdit, a.f(this.messageTypingState, a.f(this.messageReply, a.f(this.messageRead, a.f(this.messageNew, a.f(this.messageDeny, a.f(this.messageAllow, a.f(this.marketCommentRestore, a.f(this.marketCommentNew, a.f(this.marketCommentEdit, a.f(this.marketCommentDelete, a.f(this.groupOfficersEdit, a.f(this.groupLeave, a.f(this.groupJoin, a.f(this.groupChangeSettings, a.f(this.groupChangePhoto, a.f(this.boardPostRestore, a.f(this.boardPostNew, a.f(this.boardPostEdit, a.f(this.boardPostDelete, this.audioNew.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        BaseBoolInt baseBoolInt = this.leadFormsNew;
        int iHashCode = (iF + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.marketOrderNew;
        int iHashCode2 = (iHashCode + (baseBoolInt2 == null ? 0 : baseBoolInt2.hashCode())) * 31;
        BaseBoolInt baseBoolInt3 = this.marketOrderEdit;
        return iHashCode2 + (baseBoolInt3 != null ? baseBoolInt3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseBoolInt baseBoolInt = this.audioNew;
        BaseBoolInt baseBoolInt2 = this.boardPostDelete;
        BaseBoolInt baseBoolInt3 = this.boardPostEdit;
        BaseBoolInt baseBoolInt4 = this.boardPostNew;
        BaseBoolInt baseBoolInt5 = this.boardPostRestore;
        BaseBoolInt baseBoolInt6 = this.groupChangePhoto;
        BaseBoolInt baseBoolInt7 = this.groupChangeSettings;
        BaseBoolInt baseBoolInt8 = this.groupJoin;
        BaseBoolInt baseBoolInt9 = this.groupLeave;
        BaseBoolInt baseBoolInt10 = this.groupOfficersEdit;
        BaseBoolInt baseBoolInt11 = this.marketCommentDelete;
        BaseBoolInt baseBoolInt12 = this.marketCommentEdit;
        BaseBoolInt baseBoolInt13 = this.marketCommentNew;
        BaseBoolInt baseBoolInt14 = this.marketCommentRestore;
        BaseBoolInt baseBoolInt15 = this.messageAllow;
        BaseBoolInt baseBoolInt16 = this.messageDeny;
        BaseBoolInt baseBoolInt17 = this.messageNew;
        BaseBoolInt baseBoolInt18 = this.messageRead;
        BaseBoolInt baseBoolInt19 = this.messageReply;
        BaseBoolInt baseBoolInt20 = this.messageTypingState;
        BaseBoolInt baseBoolInt21 = this.messageEdit;
        BaseBoolInt baseBoolInt22 = this.photoCommentDelete;
        BaseBoolInt baseBoolInt23 = this.photoCommentEdit;
        BaseBoolInt baseBoolInt24 = this.photoCommentNew;
        BaseBoolInt baseBoolInt25 = this.photoCommentRestore;
        BaseBoolInt baseBoolInt26 = this.photoNew;
        BaseBoolInt baseBoolInt27 = this.pollVoteNew;
        BaseBoolInt baseBoolInt28 = this.userBlock;
        BaseBoolInt baseBoolInt29 = this.userUnblock;
        BaseBoolInt baseBoolInt30 = this.videoCommentDelete;
        BaseBoolInt baseBoolInt31 = this.videoCommentEdit;
        BaseBoolInt baseBoolInt32 = this.videoCommentNew;
        BaseBoolInt baseBoolInt33 = this.videoCommentRestore;
        BaseBoolInt baseBoolInt34 = this.videoNew;
        BaseBoolInt baseBoolInt35 = this.wallPostNew;
        BaseBoolInt baseBoolInt36 = this.wallReplyDelete;
        BaseBoolInt baseBoolInt37 = this.wallReplyEdit;
        BaseBoolInt baseBoolInt38 = this.wallReplyNew;
        BaseBoolInt baseBoolInt39 = this.wallReplyRestore;
        BaseBoolInt baseBoolInt40 = this.wallRepost;
        BaseBoolInt baseBoolInt41 = this.donutSubscriptionCreate;
        BaseBoolInt baseBoolInt42 = this.donutSubscriptionProlonged;
        BaseBoolInt baseBoolInt43 = this.donutSubscriptionCancelled;
        BaseBoolInt baseBoolInt44 = this.donutSubscriptionExpired;
        BaseBoolInt baseBoolInt45 = this.donutSubscriptionPriceChanged;
        BaseBoolInt baseBoolInt46 = this.donutMoneyWithdraw;
        BaseBoolInt baseBoolInt47 = this.donutMoneyWithdrawError;
        BaseBoolInt baseBoolInt48 = this.leadFormsNew;
        BaseBoolInt baseBoolInt49 = this.marketOrderNew;
        BaseBoolInt baseBoolInt50 = this.marketOrderEdit;
        StringBuilder sb2 = new StringBuilder("GroupsLongPollEvents(audioNew=");
        sb2.append(baseBoolInt);
        sb2.append(", boardPostDelete=");
        sb2.append(baseBoolInt2);
        sb2.append(", boardPostEdit=");
        a.s(sb2, baseBoolInt3, ", boardPostNew=", baseBoolInt4, ", boardPostRestore=");
        a.s(sb2, baseBoolInt5, ", groupChangePhoto=", baseBoolInt6, ", groupChangeSettings=");
        a.s(sb2, baseBoolInt7, ", groupJoin=", baseBoolInt8, ", groupLeave=");
        a.s(sb2, baseBoolInt9, ", groupOfficersEdit=", baseBoolInt10, ", marketCommentDelete=");
        a.s(sb2, baseBoolInt11, ", marketCommentEdit=", baseBoolInt12, ", marketCommentNew=");
        a.s(sb2, baseBoolInt13, ", marketCommentRestore=", baseBoolInt14, ", messageAllow=");
        a.s(sb2, baseBoolInt15, ", messageDeny=", baseBoolInt16, ", messageNew=");
        a.s(sb2, baseBoolInt17, ", messageRead=", baseBoolInt18, ", messageReply=");
        a.s(sb2, baseBoolInt19, ", messageTypingState=", baseBoolInt20, ", messageEdit=");
        a.s(sb2, baseBoolInt21, ", photoCommentDelete=", baseBoolInt22, ", photoCommentEdit=");
        a.s(sb2, baseBoolInt23, ", photoCommentNew=", baseBoolInt24, ", photoCommentRestore=");
        a.s(sb2, baseBoolInt25, ", photoNew=", baseBoolInt26, ", pollVoteNew=");
        a.s(sb2, baseBoolInt27, ", userBlock=", baseBoolInt28, ", userUnblock=");
        a.s(sb2, baseBoolInt29, ", videoCommentDelete=", baseBoolInt30, ", videoCommentEdit=");
        a.s(sb2, baseBoolInt31, ", videoCommentNew=", baseBoolInt32, ", videoCommentRestore=");
        a.s(sb2, baseBoolInt33, ", videoNew=", baseBoolInt34, ", wallPostNew=");
        a.s(sb2, baseBoolInt35, ", wallReplyDelete=", baseBoolInt36, ", wallReplyEdit=");
        a.s(sb2, baseBoolInt37, ", wallReplyNew=", baseBoolInt38, ", wallReplyRestore=");
        a.s(sb2, baseBoolInt39, ", wallRepost=", baseBoolInt40, ", donutSubscriptionCreate=");
        a.s(sb2, baseBoolInt41, ", donutSubscriptionProlonged=", baseBoolInt42, ", donutSubscriptionCancelled=");
        a.s(sb2, baseBoolInt43, ", donutSubscriptionExpired=", baseBoolInt44, ", donutSubscriptionPriceChanged=");
        a.s(sb2, baseBoolInt45, ", donutMoneyWithdraw=", baseBoolInt46, ", donutMoneyWithdrawError=");
        a.s(sb2, baseBoolInt47, ", leadFormsNew=", baseBoolInt48, ", marketOrderNew=");
        sb2.append(baseBoolInt49);
        sb2.append(", marketOrderEdit=");
        sb2.append(baseBoolInt50);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ GroupsLongPollEvents(BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, BaseBoolInt baseBoolInt4, BaseBoolInt baseBoolInt5, BaseBoolInt baseBoolInt6, BaseBoolInt baseBoolInt7, BaseBoolInt baseBoolInt8, BaseBoolInt baseBoolInt9, BaseBoolInt baseBoolInt10, BaseBoolInt baseBoolInt11, BaseBoolInt baseBoolInt12, BaseBoolInt baseBoolInt13, BaseBoolInt baseBoolInt14, BaseBoolInt baseBoolInt15, BaseBoolInt baseBoolInt16, BaseBoolInt baseBoolInt17, BaseBoolInt baseBoolInt18, BaseBoolInt baseBoolInt19, BaseBoolInt baseBoolInt20, BaseBoolInt baseBoolInt21, BaseBoolInt baseBoolInt22, BaseBoolInt baseBoolInt23, BaseBoolInt baseBoolInt24, BaseBoolInt baseBoolInt25, BaseBoolInt baseBoolInt26, BaseBoolInt baseBoolInt27, BaseBoolInt baseBoolInt28, BaseBoolInt baseBoolInt29, BaseBoolInt baseBoolInt30, BaseBoolInt baseBoolInt31, BaseBoolInt baseBoolInt32, BaseBoolInt baseBoolInt33, BaseBoolInt baseBoolInt34, BaseBoolInt baseBoolInt35, BaseBoolInt baseBoolInt36, BaseBoolInt baseBoolInt37, BaseBoolInt baseBoolInt38, BaseBoolInt baseBoolInt39, BaseBoolInt baseBoolInt40, BaseBoolInt baseBoolInt41, BaseBoolInt baseBoolInt42, BaseBoolInt baseBoolInt43, BaseBoolInt baseBoolInt44, BaseBoolInt baseBoolInt45, BaseBoolInt baseBoolInt46, BaseBoolInt baseBoolInt47, BaseBoolInt baseBoolInt48, BaseBoolInt baseBoolInt49, BaseBoolInt baseBoolInt50, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, baseBoolInt2, baseBoolInt3, baseBoolInt4, baseBoolInt5, baseBoolInt6, baseBoolInt7, baseBoolInt8, baseBoolInt9, baseBoolInt10, baseBoolInt11, baseBoolInt12, baseBoolInt13, baseBoolInt14, baseBoolInt15, baseBoolInt16, baseBoolInt17, baseBoolInt18, baseBoolInt19, baseBoolInt20, baseBoolInt21, baseBoolInt22, baseBoolInt23, baseBoolInt24, baseBoolInt25, baseBoolInt26, baseBoolInt27, baseBoolInt28, baseBoolInt29, baseBoolInt30, baseBoolInt31, baseBoolInt32, baseBoolInt33, baseBoolInt34, baseBoolInt35, baseBoolInt36, baseBoolInt37, baseBoolInt38, baseBoolInt39, baseBoolInt40, baseBoolInt41, baseBoolInt42, baseBoolInt43, baseBoolInt44, baseBoolInt45, baseBoolInt46, baseBoolInt47, (i10 & 32768) != 0 ? null : baseBoolInt48, (i10 & 65536) != 0 ? null : baseBoolInt49, (i10 & 131072) != 0 ? null : baseBoolInt50);
    }
}
