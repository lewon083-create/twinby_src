package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class MessagesGraffiti {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("height")
    private final int height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15196id;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("url")
    @NotNull
    private final String url;

    @b("width")
    private final int width;

    public MessagesGraffiti(int i, @NotNull UserId ownerId, @NotNull String url, int i10, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15196id = i;
        this.ownerId = ownerId;
        this.url = url;
        this.width = i10;
        this.height = i11;
        this.accessKey = str;
    }

    public static /* synthetic */ MessagesGraffiti copy$default(MessagesGraffiti messagesGraffiti, int i, UserId userId, String str, int i10, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = messagesGraffiti.f15196id;
        }
        if ((i12 & 2) != 0) {
            userId = messagesGraffiti.ownerId;
        }
        if ((i12 & 4) != 0) {
            str = messagesGraffiti.url;
        }
        if ((i12 & 8) != 0) {
            i10 = messagesGraffiti.width;
        }
        if ((i12 & 16) != 0) {
            i11 = messagesGraffiti.height;
        }
        if ((i12 & 32) != 0) {
            str2 = messagesGraffiti.accessKey;
        }
        int i13 = i11;
        String str3 = str2;
        return messagesGraffiti.copy(i, userId, str, i10, i13, str3);
    }

    public final int component1() {
        return this.f15196id;
    }

    @NotNull
    public final UserId component2() {
        return this.ownerId;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    public final int component4() {
        return this.width;
    }

    public final int component5() {
        return this.height;
    }

    @Nullable
    public final String component6() {
        return this.accessKey;
    }

    @NotNull
    public final MessagesGraffiti copy(int i, @NotNull UserId ownerId, @NotNull String url, int i10, int i11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new MessagesGraffiti(i, ownerId, url, i10, i11, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGraffiti)) {
            return false;
        }
        MessagesGraffiti messagesGraffiti = (MessagesGraffiti) obj;
        return this.f15196id == messagesGraffiti.f15196id && Intrinsics.a(this.ownerId, messagesGraffiti.ownerId) && Intrinsics.a(this.url, messagesGraffiti.url) && this.width == messagesGraffiti.width && this.height == messagesGraffiti.height && Intrinsics.a(this.accessKey, messagesGraffiti.accessKey);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.f15196id;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iG = u.g(this.height, u.g(this.width, a.e(o.e(this.ownerId, Integer.hashCode(this.f15196id) * 31, 31), 31, this.url), 31), 31);
        String str = this.accessKey;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15196id;
        UserId userId = this.ownerId;
        String str = this.url;
        int i10 = this.width;
        int i11 = this.height;
        String str2 = this.accessKey;
        StringBuilder sb2 = new StringBuilder("MessagesGraffiti(id=");
        sb2.append(i);
        sb2.append(", ownerId=");
        sb2.append(userId);
        sb2.append(", url=");
        o.p(i10, str, ", width=", ", height=", sb2);
        sb2.append(i11);
        sb2.append(", accessKey=");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ MessagesGraffiti(int i, UserId userId, String str, int i10, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, i10, i11, (i12 & 32) != 0 ? null : str2);
    }
}
