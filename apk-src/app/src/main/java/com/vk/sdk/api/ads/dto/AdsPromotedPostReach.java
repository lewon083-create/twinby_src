package com.vk.sdk.api.ads.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
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
public final class AdsPromotedPostReach {

    @b("hide")
    private final int hide;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15121id;

    @b("join_group")
    private final int joinGroup;

    @b("links")
    private final int links;

    @b("reach_subscribers")
    private final int reachSubscribers;

    @b("reach_total")
    private final int reachTotal;

    @b("report")
    private final int report;

    @b("to_group")
    private final int toGroup;

    @b("unsubscribe")
    private final int unsubscribe;

    @b("video_views_100p")
    @Nullable
    private final Integer videoViews100p;

    @b("video_views_25p")
    @Nullable
    private final Integer videoViews25p;

    @b("video_views_3s")
    @Nullable
    private final Integer videoViews3s;

    @b("video_views_50p")
    @Nullable
    private final Integer videoViews50p;

    @b("video_views_75p")
    @Nullable
    private final Integer videoViews75p;

    @b("video_views_start")
    @Nullable
    private final Integer videoViewsStart;

    public AdsPromotedPostReach(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this.hide = i;
        this.f15121id = i10;
        this.joinGroup = i11;
        this.links = i12;
        this.reachSubscribers = i13;
        this.reachTotal = i14;
        this.report = i15;
        this.toGroup = i16;
        this.unsubscribe = i17;
        this.videoViews100p = num;
        this.videoViews25p = num2;
        this.videoViews3s = num3;
        this.videoViews50p = num4;
        this.videoViews75p = num5;
        this.videoViewsStart = num6;
    }

    public final int component1() {
        return this.hide;
    }

    @Nullable
    public final Integer component10() {
        return this.videoViews100p;
    }

    @Nullable
    public final Integer component11() {
        return this.videoViews25p;
    }

    @Nullable
    public final Integer component12() {
        return this.videoViews3s;
    }

    @Nullable
    public final Integer component13() {
        return this.videoViews50p;
    }

    @Nullable
    public final Integer component14() {
        return this.videoViews75p;
    }

    @Nullable
    public final Integer component15() {
        return this.videoViewsStart;
    }

    public final int component2() {
        return this.f15121id;
    }

    public final int component3() {
        return this.joinGroup;
    }

    public final int component4() {
        return this.links;
    }

    public final int component5() {
        return this.reachSubscribers;
    }

    public final int component6() {
        return this.reachTotal;
    }

    public final int component7() {
        return this.report;
    }

    public final int component8() {
        return this.toGroup;
    }

    public final int component9() {
        return this.unsubscribe;
    }

    @NotNull
    public final AdsPromotedPostReach copy(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        return new AdsPromotedPostReach(i, i10, i11, i12, i13, i14, i15, i16, i17, num, num2, num3, num4, num5, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPromotedPostReach)) {
            return false;
        }
        AdsPromotedPostReach adsPromotedPostReach = (AdsPromotedPostReach) obj;
        return this.hide == adsPromotedPostReach.hide && this.f15121id == adsPromotedPostReach.f15121id && this.joinGroup == adsPromotedPostReach.joinGroup && this.links == adsPromotedPostReach.links && this.reachSubscribers == adsPromotedPostReach.reachSubscribers && this.reachTotal == adsPromotedPostReach.reachTotal && this.report == adsPromotedPostReach.report && this.toGroup == adsPromotedPostReach.toGroup && this.unsubscribe == adsPromotedPostReach.unsubscribe && Intrinsics.a(this.videoViews100p, adsPromotedPostReach.videoViews100p) && Intrinsics.a(this.videoViews25p, adsPromotedPostReach.videoViews25p) && Intrinsics.a(this.videoViews3s, adsPromotedPostReach.videoViews3s) && Intrinsics.a(this.videoViews50p, adsPromotedPostReach.videoViews50p) && Intrinsics.a(this.videoViews75p, adsPromotedPostReach.videoViews75p) && Intrinsics.a(this.videoViewsStart, adsPromotedPostReach.videoViewsStart);
    }

    public final int getHide() {
        return this.hide;
    }

    public final int getId() {
        return this.f15121id;
    }

    public final int getJoinGroup() {
        return this.joinGroup;
    }

    public final int getLinks() {
        return this.links;
    }

    public final int getReachSubscribers() {
        return this.reachSubscribers;
    }

    public final int getReachTotal() {
        return this.reachTotal;
    }

    public final int getReport() {
        return this.report;
    }

    public final int getToGroup() {
        return this.toGroup;
    }

    public final int getUnsubscribe() {
        return this.unsubscribe;
    }

    @Nullable
    public final Integer getVideoViews100p() {
        return this.videoViews100p;
    }

    @Nullable
    public final Integer getVideoViews25p() {
        return this.videoViews25p;
    }

    @Nullable
    public final Integer getVideoViews3s() {
        return this.videoViews3s;
    }

    @Nullable
    public final Integer getVideoViews50p() {
        return this.videoViews50p;
    }

    @Nullable
    public final Integer getVideoViews75p() {
        return this.videoViews75p;
    }

    @Nullable
    public final Integer getVideoViewsStart() {
        return this.videoViewsStart;
    }

    public int hashCode() {
        int iG = u.g(this.unsubscribe, u.g(this.toGroup, u.g(this.report, u.g(this.reachTotal, u.g(this.reachSubscribers, u.g(this.links, u.g(this.joinGroup, u.g(this.f15121id, Integer.hashCode(this.hide) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.videoViews100p;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.videoViews25p;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoViews3s;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoViews50p;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoViews75p;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.videoViewsStart;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.hide;
        int i10 = this.f15121id;
        int i11 = this.joinGroup;
        int i12 = this.links;
        int i13 = this.reachSubscribers;
        int i14 = this.reachTotal;
        int i15 = this.report;
        int i16 = this.toGroup;
        int i17 = this.unsubscribe;
        Integer num = this.videoViews100p;
        Integer num2 = this.videoViews25p;
        Integer num3 = this.videoViews3s;
        Integer num4 = this.videoViews50p;
        Integer num5 = this.videoViews75p;
        Integer num6 = this.videoViewsStart;
        StringBuilder sbI = z.i("AdsPromotedPostReach(hide=", i, ", id=", i10, ", joinGroup=");
        om1.t(sbI, i11, ", links=", i12, ", reachSubscribers=");
        om1.t(sbI, i13, ", reachTotal=", i14, ", report=");
        om1.t(sbI, i15, ", toGroup=", i16, ", unsubscribe=");
        sbI.append(i17);
        sbI.append(", videoViews100p=");
        sbI.append(num);
        sbI.append(", videoViews25p=");
        a.t(sbI, num2, ", videoViews3s=", num3, ", videoViews50p=");
        a.t(sbI, num4, ", videoViews75p=", num5, ", videoViewsStart=");
        return u.m(sbI, num6, ")");
    }

    public /* synthetic */ AdsPromotedPostReach(int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, i11, i12, i13, i14, i15, i16, i17, (i18 & 512) != 0 ? null : num, (i18 & 1024) != 0 ? null : num2, (i18 & 2048) != 0 ? null : num3, (i18 & 4096) != 0 ? null : num4, (i18 & 8192) != 0 ? null : num5, (i18 & 16384) != 0 ? null : num6);
    }
}
