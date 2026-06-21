package com.vk.sdk.api.polls.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseGradientPoint;
import com.vk.sdk.api.base.dto.BaseImage;
import gf.a;
import io.sentry.protocol.DebugMeta;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class PollsBackground {

    @b("angle")
    @Nullable
    private final Integer angle;

    @b("color")
    @Nullable
    private final String color;

    @b("height")
    @Nullable
    private final Integer height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15228id;

    @b(DebugMeta.JsonKeys.IMAGES)
    @Nullable
    private final List<BaseImage> images;

    @b("name")
    @Nullable
    private final String name;

    @b("points")
    @Nullable
    private final List<BaseGradientPoint> points;

    @b("type")
    @Nullable
    private final Type type;

    @b("width")
    @Nullable
    private final Integer width;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        GRADIENT("gradient"),
        TILE("tile");


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

    public PollsBackground() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollsBackground copy$default(PollsBackground pollsBackground, Integer num, String str, Integer num2, Integer num3, String str2, List list, List list2, Type type, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pollsBackground.angle;
        }
        if ((i & 2) != 0) {
            str = pollsBackground.color;
        }
        if ((i & 4) != 0) {
            num2 = pollsBackground.height;
        }
        if ((i & 8) != 0) {
            num3 = pollsBackground.f15228id;
        }
        if ((i & 16) != 0) {
            str2 = pollsBackground.name;
        }
        if ((i & 32) != 0) {
            list = pollsBackground.images;
        }
        if ((i & 64) != 0) {
            list2 = pollsBackground.points;
        }
        if ((i & 128) != 0) {
            type = pollsBackground.type;
        }
        if ((i & 256) != 0) {
            num4 = pollsBackground.width;
        }
        Type type2 = type;
        Integer num5 = num4;
        List list3 = list;
        List list4 = list2;
        String str3 = str2;
        Integer num6 = num2;
        return pollsBackground.copy(num, str, num6, num3, str3, list3, list4, type2, num5);
    }

    @Nullable
    public final Integer component1() {
        return this.angle;
    }

    @Nullable
    public final String component2() {
        return this.color;
    }

    @Nullable
    public final Integer component3() {
        return this.height;
    }

    @Nullable
    public final Integer component4() {
        return this.f15228id;
    }

    @Nullable
    public final String component5() {
        return this.name;
    }

    @Nullable
    public final List<BaseImage> component6() {
        return this.images;
    }

    @Nullable
    public final List<BaseGradientPoint> component7() {
        return this.points;
    }

    @Nullable
    public final Type component8() {
        return this.type;
    }

    @Nullable
    public final Integer component9() {
        return this.width;
    }

    @NotNull
    public final PollsBackground copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable List<BaseImage> list, @Nullable List<BaseGradientPoint> list2, @Nullable Type type, @Nullable Integer num4) {
        return new PollsBackground(num, str, num2, num3, str2, list, list2, type, num4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsBackground)) {
            return false;
        }
        PollsBackground pollsBackground = (PollsBackground) obj;
        return Intrinsics.a(this.angle, pollsBackground.angle) && Intrinsics.a(this.color, pollsBackground.color) && Intrinsics.a(this.height, pollsBackground.height) && Intrinsics.a(this.f15228id, pollsBackground.f15228id) && Intrinsics.a(this.name, pollsBackground.name) && Intrinsics.a(this.images, pollsBackground.images) && Intrinsics.a(this.points, pollsBackground.points) && this.type == pollsBackground.type && Intrinsics.a(this.width, pollsBackground.width);
    }

    @Nullable
    public final Integer getAngle() {
        return this.angle;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getId() {
        return this.f15228id;
    }

    @Nullable
    public final List<BaseImage> getImages() {
        return this.images;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<BaseGradientPoint> getPoints() {
        return this.points;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.angle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f15228id;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImage> list = this.images;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseGradientPoint> list2 = this.points;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Type type = this.type;
        int iHashCode8 = (iHashCode7 + (type == null ? 0 : type.hashCode())) * 31;
        Integer num4 = this.width;
        return iHashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.angle;
        String str = this.color;
        Integer num2 = this.height;
        Integer num3 = this.f15228id;
        String str2 = this.name;
        List<BaseImage> list = this.images;
        List<BaseGradientPoint> list2 = this.points;
        Type type = this.type;
        Integer num4 = this.width;
        StringBuilder sb2 = new StringBuilder("PollsBackground(angle=");
        sb2.append(num);
        sb2.append(", color=");
        sb2.append(str);
        sb2.append(", height=");
        a.t(sb2, num2, ", id=", num3, ", name=");
        sb2.append(str2);
        sb2.append(", images=");
        sb2.append(list);
        sb2.append(", points=");
        sb2.append(list2);
        sb2.append(", type=");
        sb2.append(type);
        sb2.append(", width=");
        return u.m(sb2, num4, ")");
    }

    public PollsBackground(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable List<BaseImage> list, @Nullable List<BaseGradientPoint> list2, @Nullable Type type, @Nullable Integer num4) {
        this.angle = num;
        this.color = str;
        this.height = num2;
        this.f15228id = num3;
        this.name = str2;
        this.images = list;
        this.points = list2;
        this.type = type;
        this.width = num4;
    }

    public /* synthetic */ PollsBackground(Integer num, String str, Integer num2, Integer num3, String str2, List list, List list2, Type type, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : type, (i & 256) != 0 ? null : num4);
    }
}
