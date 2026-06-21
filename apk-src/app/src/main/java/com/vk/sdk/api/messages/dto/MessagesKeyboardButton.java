package com.vk.sdk.api.messages.dto;

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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class MessagesKeyboardButton {

    @b("action")
    @NotNull
    private final MessagesKeyboardButtonPropertyAction action;

    @b("color")
    @Nullable
    private final Color color;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Color {
        DEFAULT("default"),
        POSITIVE("positive"),
        NEGATIVE("negative"),
        PRIMARY("primary");


        @NotNull
        private final String value;

        Color(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public MessagesKeyboardButton(@NotNull MessagesKeyboardButtonPropertyAction action, @Nullable Color color) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.color = color;
    }

    public static /* synthetic */ MessagesKeyboardButton copy$default(MessagesKeyboardButton messagesKeyboardButton, MessagesKeyboardButtonPropertyAction messagesKeyboardButtonPropertyAction, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            messagesKeyboardButtonPropertyAction = messagesKeyboardButton.action;
        }
        if ((i & 2) != 0) {
            color = messagesKeyboardButton.color;
        }
        return messagesKeyboardButton.copy(messagesKeyboardButtonPropertyAction, color);
    }

    @NotNull
    public final MessagesKeyboardButtonPropertyAction component1() {
        return this.action;
    }

    @Nullable
    public final Color component2() {
        return this.color;
    }

    @NotNull
    public final MessagesKeyboardButton copy(@NotNull MessagesKeyboardButtonPropertyAction action, @Nullable Color color) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new MessagesKeyboardButton(action, color);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardButton)) {
            return false;
        }
        MessagesKeyboardButton messagesKeyboardButton = (MessagesKeyboardButton) obj;
        return Intrinsics.a(this.action, messagesKeyboardButton.action) && this.color == messagesKeyboardButton.color;
    }

    @NotNull
    public final MessagesKeyboardButtonPropertyAction getAction() {
        return this.action;
    }

    @Nullable
    public final Color getColor() {
        return this.color;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        Color color = this.color;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessagesKeyboardButton(action=" + this.action + ", color=" + this.color + ")";
    }

    public /* synthetic */ MessagesKeyboardButton(MessagesKeyboardButtonPropertyAction messagesKeyboardButtonPropertyAction, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messagesKeyboardButtonPropertyAction, (i & 2) != 0 ? null : color);
    }
}
