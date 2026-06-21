package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import java.util.List;
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
public final class MessagesKeyboard {

    @b("author_id")
    @Nullable
    private final UserId authorId;

    @b("buttons")
    @NotNull
    private final List<List<MessagesKeyboardButton>> buttons;

    @b("inline")
    @Nullable
    private final Boolean inline;

    @b("one_time")
    private final boolean oneTime;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesKeyboard(boolean z5, @NotNull List<? extends List<MessagesKeyboardButton>> buttons, @Nullable UserId userId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.oneTime = z5;
        this.buttons = buttons;
        this.authorId = userId;
        this.inline = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesKeyboard copy$default(MessagesKeyboard messagesKeyboard, boolean z5, List list, UserId userId, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = messagesKeyboard.oneTime;
        }
        if ((i & 2) != 0) {
            list = messagesKeyboard.buttons;
        }
        if ((i & 4) != 0) {
            userId = messagesKeyboard.authorId;
        }
        if ((i & 8) != 0) {
            bool = messagesKeyboard.inline;
        }
        return messagesKeyboard.copy(z5, list, userId, bool);
    }

    public final boolean component1() {
        return this.oneTime;
    }

    @NotNull
    public final List<List<MessagesKeyboardButton>> component2() {
        return this.buttons;
    }

    @Nullable
    public final UserId component3() {
        return this.authorId;
    }

    @Nullable
    public final Boolean component4() {
        return this.inline;
    }

    @NotNull
    public final MessagesKeyboard copy(boolean z5, @NotNull List<? extends List<MessagesKeyboardButton>> buttons, @Nullable UserId userId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new MessagesKeyboard(z5, buttons, userId, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboard)) {
            return false;
        }
        MessagesKeyboard messagesKeyboard = (MessagesKeyboard) obj;
        return this.oneTime == messagesKeyboard.oneTime && Intrinsics.a(this.buttons, messagesKeyboard.buttons) && Intrinsics.a(this.authorId, messagesKeyboard.authorId) && Intrinsics.a(this.inline, messagesKeyboard.inline);
    }

    @Nullable
    public final UserId getAuthorId() {
        return this.authorId;
    }

    @NotNull
    public final List<List<MessagesKeyboardButton>> getButtons() {
        return this.buttons;
    }

    @Nullable
    public final Boolean getInline() {
        return this.inline;
    }

    public final boolean getOneTime() {
        return this.oneTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z5 = this.oneTime;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = u.i(this.buttons, r02 * 31, 31);
        UserId userId = this.authorId;
        int iHashCode = (i + (userId == null ? 0 : userId.hashCode())) * 31;
        Boolean bool = this.inline;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesKeyboard(oneTime=" + this.oneTime + ", buttons=" + this.buttons + ", authorId=" + this.authorId + ", inline=" + this.inline + ")";
    }

    public /* synthetic */ MessagesKeyboard(boolean z5, List list, UserId userId, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, list, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : bool);
    }
}
