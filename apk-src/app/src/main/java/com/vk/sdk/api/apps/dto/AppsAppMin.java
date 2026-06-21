package com.vk.sdk.api.apps.dto;

import a0.u;
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
public final class AppsAppMin {

    @b("author_owner_id")
    @Nullable
    private final Integer authorOwnerId;

    @b("background_loader_color")
    @Nullable
    private final String backgroundLoaderColor;

    @b("icon_139")
    @Nullable
    private final String icon139;

    @b("icon_150")
    @Nullable
    private final String icon150;

    @b("icon_278")
    @Nullable
    private final String icon278;

    @b("icon_576")
    @Nullable
    private final String icon576;

    @b("icon_75")
    @Nullable
    private final String icon75;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15129id;

    @b("is_installed")
    @Nullable
    private final Boolean isInstalled;

    @b("loader_icon")
    @Nullable
    private final String loaderIcon;

    @b("open_in_external_browser")
    @Nullable
    private final Boolean openInExternalBrowser;

    @b("title")
    @NotNull
    private final String title;

    @b("type")
    @NotNull
    private final AppsAppType type;

    public AppsAppMin(@NotNull AppsAppType type, int i, @NotNull String title, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.type = type;
        this.f15129id = i;
        this.title = title;
        this.authorOwnerId = num;
        this.isInstalled = bool;
        this.icon139 = str;
        this.icon150 = str2;
        this.icon278 = str3;
        this.icon576 = str4;
        this.backgroundLoaderColor = str5;
        this.loaderIcon = str6;
        this.icon75 = str7;
        this.openInExternalBrowser = bool2;
    }

    public static /* synthetic */ AppsAppMin copy$default(AppsAppMin appsAppMin, AppsAppType appsAppType, int i, String str, Integer num, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            appsAppType = appsAppMin.type;
        }
        return appsAppMin.copy(appsAppType, (i10 & 2) != 0 ? appsAppMin.f15129id : i, (i10 & 4) != 0 ? appsAppMin.title : str, (i10 & 8) != 0 ? appsAppMin.authorOwnerId : num, (i10 & 16) != 0 ? appsAppMin.isInstalled : bool, (i10 & 32) != 0 ? appsAppMin.icon139 : str2, (i10 & 64) != 0 ? appsAppMin.icon150 : str3, (i10 & 128) != 0 ? appsAppMin.icon278 : str4, (i10 & 256) != 0 ? appsAppMin.icon576 : str5, (i10 & 512) != 0 ? appsAppMin.backgroundLoaderColor : str6, (i10 & 1024) != 0 ? appsAppMin.loaderIcon : str7, (i10 & 2048) != 0 ? appsAppMin.icon75 : str8, (i10 & 4096) != 0 ? appsAppMin.openInExternalBrowser : bool2);
    }

    @NotNull
    public final AppsAppType component1() {
        return this.type;
    }

    @Nullable
    public final String component10() {
        return this.backgroundLoaderColor;
    }

    @Nullable
    public final String component11() {
        return this.loaderIcon;
    }

    @Nullable
    public final String component12() {
        return this.icon75;
    }

    @Nullable
    public final Boolean component13() {
        return this.openInExternalBrowser;
    }

    public final int component2() {
        return this.f15129id;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final Integer component4() {
        return this.authorOwnerId;
    }

    @Nullable
    public final Boolean component5() {
        return this.isInstalled;
    }

    @Nullable
    public final String component6() {
        return this.icon139;
    }

    @Nullable
    public final String component7() {
        return this.icon150;
    }

    @Nullable
    public final String component8() {
        return this.icon278;
    }

    @Nullable
    public final String component9() {
        return this.icon576;
    }

    @NotNull
    public final AppsAppMin copy(@NotNull AppsAppType type, int i, @NotNull String title, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        return new AppsAppMin(type, i, title, num, bool, str, str2, str3, str4, str5, str6, str7, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppMin)) {
            return false;
        }
        AppsAppMin appsAppMin = (AppsAppMin) obj;
        return this.type == appsAppMin.type && this.f15129id == appsAppMin.f15129id && Intrinsics.a(this.title, appsAppMin.title) && Intrinsics.a(this.authorOwnerId, appsAppMin.authorOwnerId) && Intrinsics.a(this.isInstalled, appsAppMin.isInstalled) && Intrinsics.a(this.icon139, appsAppMin.icon139) && Intrinsics.a(this.icon150, appsAppMin.icon150) && Intrinsics.a(this.icon278, appsAppMin.icon278) && Intrinsics.a(this.icon576, appsAppMin.icon576) && Intrinsics.a(this.backgroundLoaderColor, appsAppMin.backgroundLoaderColor) && Intrinsics.a(this.loaderIcon, appsAppMin.loaderIcon) && Intrinsics.a(this.icon75, appsAppMin.icon75) && Intrinsics.a(this.openInExternalBrowser, appsAppMin.openInExternalBrowser);
    }

    @Nullable
    public final Integer getAuthorOwnerId() {
        return this.authorOwnerId;
    }

    @Nullable
    public final String getBackgroundLoaderColor() {
        return this.backgroundLoaderColor;
    }

    @Nullable
    public final String getIcon139() {
        return this.icon139;
    }

    @Nullable
    public final String getIcon150() {
        return this.icon150;
    }

    @Nullable
    public final String getIcon278() {
        return this.icon278;
    }

    @Nullable
    public final String getIcon576() {
        return this.icon576;
    }

    @Nullable
    public final String getIcon75() {
        return this.icon75;
    }

    public final int getId() {
        return this.f15129id;
    }

    @Nullable
    public final String getLoaderIcon() {
        return this.loaderIcon;
    }

    @Nullable
    public final Boolean getOpenInExternalBrowser() {
        return this.openInExternalBrowser;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final AppsAppType getType() {
        return this.type;
    }

    public int hashCode() {
        int iE = a.e(u.g(this.f15129id, this.type.hashCode() * 31, 31), 31, this.title);
        Integer num = this.authorOwnerId;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isInstalled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.icon139;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon150;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon278;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon576;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundLoaderColor;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loaderIcon;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon75;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.openInExternalBrowser;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isInstalled() {
        return this.isInstalled;
    }

    @NotNull
    public String toString() {
        AppsAppType appsAppType = this.type;
        int i = this.f15129id;
        String str = this.title;
        Integer num = this.authorOwnerId;
        Boolean bool = this.isInstalled;
        String str2 = this.icon139;
        String str3 = this.icon150;
        String str4 = this.icon278;
        String str5 = this.icon576;
        String str6 = this.backgroundLoaderColor;
        String str7 = this.loaderIcon;
        String str8 = this.icon75;
        Boolean bool2 = this.openInExternalBrowser;
        StringBuilder sb2 = new StringBuilder("AppsAppMin(type=");
        sb2.append(appsAppType);
        sb2.append(", id=");
        sb2.append(i);
        sb2.append(", title=");
        a.r(num, str, ", authorOwnerId=", ", isInstalled=", sb2);
        sb2.append(bool);
        sb2.append(", icon139=");
        sb2.append(str2);
        sb2.append(", icon150=");
        o.t(sb2, str3, ", icon278=", str4, ", icon576=");
        o.t(sb2, str5, ", backgroundLoaderColor=", str6, ", loaderIcon=");
        o.t(sb2, str7, ", icon75=", str8, ", openInExternalBrowser=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ AppsAppMin(AppsAppType appsAppType, int i, String str, Integer num, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(appsAppType, i, str, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : str7, (i10 & 2048) != 0 ? null : str8, (i10 & 4096) != 0 ? null : bool2);
    }
}
