package com.vk.sdk.api.messages.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class MessagesMessageActionPhoto {

    @b("photo_100")
    @NotNull
    private final String photo100;

    @b("photo_200")
    @NotNull
    private final String photo200;

    @b("photo_50")
    @NotNull
    private final String photo50;

    public MessagesMessageActionPhoto(@NotNull String photo50, @NotNull String photo100, @NotNull String photo200) {
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        this.photo50 = photo50;
        this.photo100 = photo100;
        this.photo200 = photo200;
    }

    public static /* synthetic */ MessagesMessageActionPhoto copy$default(MessagesMessageActionPhoto messagesMessageActionPhoto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagesMessageActionPhoto.photo50;
        }
        if ((i & 2) != 0) {
            str2 = messagesMessageActionPhoto.photo100;
        }
        if ((i & 4) != 0) {
            str3 = messagesMessageActionPhoto.photo200;
        }
        return messagesMessageActionPhoto.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.photo50;
    }

    @NotNull
    public final String component2() {
        return this.photo100;
    }

    @NotNull
    public final String component3() {
        return this.photo200;
    }

    @NotNull
    public final MessagesMessageActionPhoto copy(@NotNull String photo50, @NotNull String photo100, @NotNull String photo200) {
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        return new MessagesMessageActionPhoto(photo50, photo100, photo200);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageActionPhoto)) {
            return false;
        }
        MessagesMessageActionPhoto messagesMessageActionPhoto = (MessagesMessageActionPhoto) obj;
        return Intrinsics.a(this.photo50, messagesMessageActionPhoto.photo50) && Intrinsics.a(this.photo100, messagesMessageActionPhoto.photo100) && Intrinsics.a(this.photo200, messagesMessageActionPhoto.photo200);
    }

    @NotNull
    public final String getPhoto100() {
        return this.photo100;
    }

    @NotNull
    public final String getPhoto200() {
        return this.photo200;
    }

    @NotNull
    public final String getPhoto50() {
        return this.photo50;
    }

    public int hashCode() {
        return this.photo200.hashCode() + a.e(this.photo50.hashCode() * 31, 31, this.photo100);
    }

    @NotNull
    public String toString() {
        String str = this.photo50;
        String str2 = this.photo100;
        return u.o(z.j("MessagesMessageActionPhoto(photo50=", str, ", photo100=", str2, ", photo200="), this.photo200, ")");
    }
}
