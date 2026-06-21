package com.vk.sdk.api.messages.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class MessagesLongpollParams {

    @b("key")
    @NotNull
    private final String key;

    @b("pts")
    @Nullable
    private final Integer pts;

    @b("server")
    @NotNull
    private final String server;

    @b("ts")
    private final int ts;

    public MessagesLongpollParams(@NotNull String server, @NotNull String key, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(key, "key");
        this.server = server;
        this.key = key;
        this.ts = i;
        this.pts = num;
    }

    public static /* synthetic */ MessagesLongpollParams copy$default(MessagesLongpollParams messagesLongpollParams, String str, String str2, int i, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messagesLongpollParams.server;
        }
        if ((i10 & 2) != 0) {
            str2 = messagesLongpollParams.key;
        }
        if ((i10 & 4) != 0) {
            i = messagesLongpollParams.ts;
        }
        if ((i10 & 8) != 0) {
            num = messagesLongpollParams.pts;
        }
        return messagesLongpollParams.copy(str, str2, i, num);
    }

    @NotNull
    public final String component1() {
        return this.server;
    }

    @NotNull
    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.ts;
    }

    @Nullable
    public final Integer component4() {
        return this.pts;
    }

    @NotNull
    public final MessagesLongpollParams copy(@NotNull String server, @NotNull String key, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(key, "key");
        return new MessagesLongpollParams(server, key, i, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLongpollParams)) {
            return false;
        }
        MessagesLongpollParams messagesLongpollParams = (MessagesLongpollParams) obj;
        return Intrinsics.a(this.server, messagesLongpollParams.server) && Intrinsics.a(this.key, messagesLongpollParams.key) && this.ts == messagesLongpollParams.ts && Intrinsics.a(this.pts, messagesLongpollParams.pts);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getPts() {
        return this.pts;
    }

    @NotNull
    public final String getServer() {
        return this.server;
    }

    public final int getTs() {
        return this.ts;
    }

    public int hashCode() {
        int iG = u.g(this.ts, a.e(this.server.hashCode() * 31, 31, this.key), 31);
        Integer num = this.pts;
        return iG + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.server;
        String str2 = this.key;
        int i = this.ts;
        Integer num = this.pts;
        StringBuilder sbJ = z.j("MessagesLongpollParams(server=", str, ", key=", str2, ", ts=");
        sbJ.append(i);
        sbJ.append(", pts=");
        sbJ.append(num);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ MessagesLongpollParams(String str, String str2, int i, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i10 & 8) != 0 ? null : num);
    }
}
