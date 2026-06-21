package com.vk.sdk.api.messages.dto;

import a0.u;
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
public final class MessagesKeyboardButtonPropertyAction {

    @b("hash")
    @NotNull
    private final String hash;

    @b("payload")
    @Nullable
    private final String payload;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        VKPAY("vkpay");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public MessagesKeyboardButtonPropertyAction(@NotNull String hash, @NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(type, "type");
        this.hash = hash;
        this.type = type;
        this.payload = str;
    }

    public static /* synthetic */ MessagesKeyboardButtonPropertyAction copy$default(MessagesKeyboardButtonPropertyAction messagesKeyboardButtonPropertyAction, String str, Type type, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagesKeyboardButtonPropertyAction.hash;
        }
        if ((i & 2) != 0) {
            type = messagesKeyboardButtonPropertyAction.type;
        }
        if ((i & 4) != 0) {
            str2 = messagesKeyboardButtonPropertyAction.payload;
        }
        return messagesKeyboardButtonPropertyAction.copy(str, type, str2);
    }

    @NotNull
    public final String component1() {
        return this.hash;
    }

    @NotNull
    public final Type component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.payload;
    }

    @NotNull
    public final MessagesKeyboardButtonPropertyAction copy(@NotNull String hash, @NotNull Type type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MessagesKeyboardButtonPropertyAction(hash, type, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardButtonPropertyAction)) {
            return false;
        }
        MessagesKeyboardButtonPropertyAction messagesKeyboardButtonPropertyAction = (MessagesKeyboardButtonPropertyAction) obj;
        return Intrinsics.a(this.hash, messagesKeyboardButtonPropertyAction.hash) && this.type == messagesKeyboardButtonPropertyAction.type && Intrinsics.a(this.payload, messagesKeyboardButtonPropertyAction.payload);
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.hash.hashCode() * 31)) * 31;
        String str = this.payload;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.hash;
        Type type = this.type;
        String str2 = this.payload;
        StringBuilder sb2 = new StringBuilder("MessagesKeyboardButtonPropertyAction(hash=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", payload=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ MessagesKeyboardButtonPropertyAction(String str, Type type, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i & 4) != 0 ? null : str2);
    }
}
