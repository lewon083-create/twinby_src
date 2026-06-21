package com.vk.sdk.api.video.dto;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class VideoVideoFiles {

    @b("external")
    @Nullable
    private final String external;

    @b("flv_320")
    @Nullable
    private final String flv320;

    @b("mp4_1080")
    @Nullable
    private final String mp41080;

    @b("mp4_1440")
    @Nullable
    private final String mp41440;

    @b("mp4_2160")
    @Nullable
    private final String mp42160;

    @b("mp4_240")
    @Nullable
    private final String mp4240;

    @b("mp4_360")
    @Nullable
    private final String mp4360;

    @b("mp4_480")
    @Nullable
    private final String mp4480;

    @b("mp4_720")
    @Nullable
    private final String mp4720;

    public VideoVideoFiles() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ VideoVideoFiles copy$default(VideoVideoFiles videoVideoFiles, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoVideoFiles.external;
        }
        if ((i & 2) != 0) {
            str2 = videoVideoFiles.mp4240;
        }
        if ((i & 4) != 0) {
            str3 = videoVideoFiles.mp4360;
        }
        if ((i & 8) != 0) {
            str4 = videoVideoFiles.mp4480;
        }
        if ((i & 16) != 0) {
            str5 = videoVideoFiles.mp4720;
        }
        if ((i & 32) != 0) {
            str6 = videoVideoFiles.mp41080;
        }
        if ((i & 64) != 0) {
            str7 = videoVideoFiles.mp41440;
        }
        if ((i & 128) != 0) {
            str8 = videoVideoFiles.mp42160;
        }
        if ((i & 256) != 0) {
            str9 = videoVideoFiles.flv320;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return videoVideoFiles.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    public final String component1() {
        return this.external;
    }

    @Nullable
    public final String component2() {
        return this.mp4240;
    }

    @Nullable
    public final String component3() {
        return this.mp4360;
    }

    @Nullable
    public final String component4() {
        return this.mp4480;
    }

    @Nullable
    public final String component5() {
        return this.mp4720;
    }

    @Nullable
    public final String component6() {
        return this.mp41080;
    }

    @Nullable
    public final String component7() {
        return this.mp41440;
    }

    @Nullable
    public final String component8() {
        return this.mp42160;
    }

    @Nullable
    public final String component9() {
        return this.flv320;
    }

    @NotNull
    public final VideoVideoFiles copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new VideoVideoFiles(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoFiles)) {
            return false;
        }
        VideoVideoFiles videoVideoFiles = (VideoVideoFiles) obj;
        return Intrinsics.a(this.external, videoVideoFiles.external) && Intrinsics.a(this.mp4240, videoVideoFiles.mp4240) && Intrinsics.a(this.mp4360, videoVideoFiles.mp4360) && Intrinsics.a(this.mp4480, videoVideoFiles.mp4480) && Intrinsics.a(this.mp4720, videoVideoFiles.mp4720) && Intrinsics.a(this.mp41080, videoVideoFiles.mp41080) && Intrinsics.a(this.mp41440, videoVideoFiles.mp41440) && Intrinsics.a(this.mp42160, videoVideoFiles.mp42160) && Intrinsics.a(this.flv320, videoVideoFiles.flv320);
    }

    @Nullable
    public final String getExternal() {
        return this.external;
    }

    @Nullable
    public final String getFlv320() {
        return this.flv320;
    }

    @Nullable
    public final String getMp41080() {
        return this.mp41080;
    }

    @Nullable
    public final String getMp41440() {
        return this.mp41440;
    }

    @Nullable
    public final String getMp42160() {
        return this.mp42160;
    }

    @Nullable
    public final String getMp4240() {
        return this.mp4240;
    }

    @Nullable
    public final String getMp4360() {
        return this.mp4360;
    }

    @Nullable
    public final String getMp4480() {
        return this.mp4480;
    }

    @Nullable
    public final String getMp4720() {
        return this.mp4720;
    }

    public int hashCode() {
        String str = this.external;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mp4240;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mp4360;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mp4480;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mp4720;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mp41080;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mp41440;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mp42160;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.flv320;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.external;
        String str2 = this.mp4240;
        String str3 = this.mp4360;
        String str4 = this.mp4480;
        String str5 = this.mp4720;
        String str6 = this.mp41080;
        String str7 = this.mp41440;
        String str8 = this.mp42160;
        String str9 = this.flv320;
        StringBuilder sbJ = z.j("VideoVideoFiles(external=", str, ", mp4240=", str2, ", mp4360=");
        o.t(sbJ, str3, ", mp4480=", str4, ", mp4720=");
        o.t(sbJ, str5, ", mp41080=", str6, ", mp41440=");
        o.t(sbJ, str7, ", mp42160=", str8, ", flv320=");
        return u.o(sbJ, str9, ")");
    }

    public VideoVideoFiles(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.external = str;
        this.mp4240 = str2;
        this.mp4360 = str3;
        this.mp4480 = str4;
        this.mp4720 = str5;
        this.mp41080 = str6;
        this.mp41440 = str7;
        this.mp42160 = str8;
        this.flv320 = str9;
    }

    public /* synthetic */ VideoVideoFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9);
    }
}
