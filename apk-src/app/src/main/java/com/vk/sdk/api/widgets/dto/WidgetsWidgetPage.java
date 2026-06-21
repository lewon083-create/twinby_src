package com.vk.sdk.api.widgets.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseObjectCount;
import gf.a;
import io.sentry.UserFeedback;
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
public final class WidgetsWidgetPage {

    @b(UserFeedback.JsonKeys.COMMENTS)
    @Nullable
    private final BaseObjectCount comments;

    @b("date")
    @Nullable
    private final Integer date;

    @b("description")
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15263id;

    @b("likes")
    @Nullable
    private final BaseObjectCount likes;

    @b("page_id")
    @Nullable
    private final String pageId;

    @b("photo")
    @Nullable
    private final String photo;

    @b("title")
    @Nullable
    private final String title;

    @b("url")
    @Nullable
    private final String url;

    public WidgetsWidgetPage() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ WidgetsWidgetPage copy$default(WidgetsWidgetPage widgetsWidgetPage, BaseObjectCount baseObjectCount, Integer num, String str, Integer num2, BaseObjectCount baseObjectCount2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            baseObjectCount = widgetsWidgetPage.comments;
        }
        if ((i & 2) != 0) {
            num = widgetsWidgetPage.date;
        }
        if ((i & 4) != 0) {
            str = widgetsWidgetPage.description;
        }
        if ((i & 8) != 0) {
            num2 = widgetsWidgetPage.f15263id;
        }
        if ((i & 16) != 0) {
            baseObjectCount2 = widgetsWidgetPage.likes;
        }
        if ((i & 32) != 0) {
            str2 = widgetsWidgetPage.pageId;
        }
        if ((i & 64) != 0) {
            str3 = widgetsWidgetPage.photo;
        }
        if ((i & 128) != 0) {
            str4 = widgetsWidgetPage.title;
        }
        if ((i & 256) != 0) {
            str5 = widgetsWidgetPage.url;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        BaseObjectCount baseObjectCount3 = baseObjectCount2;
        String str10 = str;
        return widgetsWidgetPage.copy(baseObjectCount, num, str10, num2, baseObjectCount3, str8, str9, str6, str7);
    }

    @Nullable
    public final BaseObjectCount component1() {
        return this.comments;
    }

    @Nullable
    public final Integer component2() {
        return this.date;
    }

    @Nullable
    public final String component3() {
        return this.description;
    }

    @Nullable
    public final Integer component4() {
        return this.f15263id;
    }

    @Nullable
    public final BaseObjectCount component5() {
        return this.likes;
    }

    @Nullable
    public final String component6() {
        return this.pageId;
    }

    @Nullable
    public final String component7() {
        return this.photo;
    }

    @Nullable
    public final String component8() {
        return this.title;
    }

    @Nullable
    public final String component9() {
        return this.url;
    }

    @NotNull
    public final WidgetsWidgetPage copy(@Nullable BaseObjectCount baseObjectCount, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable BaseObjectCount baseObjectCount2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new WidgetsWidgetPage(baseObjectCount, num, str, num2, baseObjectCount2, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsWidgetPage)) {
            return false;
        }
        WidgetsWidgetPage widgetsWidgetPage = (WidgetsWidgetPage) obj;
        return Intrinsics.a(this.comments, widgetsWidgetPage.comments) && Intrinsics.a(this.date, widgetsWidgetPage.date) && Intrinsics.a(this.description, widgetsWidgetPage.description) && Intrinsics.a(this.f15263id, widgetsWidgetPage.f15263id) && Intrinsics.a(this.likes, widgetsWidgetPage.likes) && Intrinsics.a(this.pageId, widgetsWidgetPage.pageId) && Intrinsics.a(this.photo, widgetsWidgetPage.photo) && Intrinsics.a(this.title, widgetsWidgetPage.title) && Intrinsics.a(this.url, widgetsWidgetPage.url);
    }

    @Nullable
    public final BaseObjectCount getComments() {
        return this.comments;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getId() {
        return this.f15263id;
    }

    @Nullable
    public final BaseObjectCount getLikes() {
        return this.likes;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final String getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        BaseObjectCount baseObjectCount = this.comments;
        int iHashCode = (baseObjectCount == null ? 0 : baseObjectCount.hashCode()) * 31;
        Integer num = this.date;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f15263id;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseObjectCount baseObjectCount2 = this.likes;
        int iHashCode5 = (iHashCode4 + (baseObjectCount2 == null ? 0 : baseObjectCount2.hashCode())) * 31;
        String str2 = this.pageId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseObjectCount baseObjectCount = this.comments;
        Integer num = this.date;
        String str = this.description;
        Integer num2 = this.f15263id;
        BaseObjectCount baseObjectCount2 = this.likes;
        String str2 = this.pageId;
        String str3 = this.photo;
        String str4 = this.title;
        String str5 = this.url;
        StringBuilder sb2 = new StringBuilder("WidgetsWidgetPage(comments=");
        sb2.append(baseObjectCount);
        sb2.append(", date=");
        sb2.append(num);
        sb2.append(", description=");
        a.r(num2, str, ", id=", ", likes=", sb2);
        sb2.append(baseObjectCount2);
        sb2.append(", pageId=");
        sb2.append(str2);
        sb2.append(", photo=");
        o.t(sb2, str3, ", title=", str4, ", url=");
        return u.o(sb2, str5, ")");
    }

    public WidgetsWidgetPage(@Nullable BaseObjectCount baseObjectCount, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable BaseObjectCount baseObjectCount2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.comments = baseObjectCount;
        this.date = num;
        this.description = str;
        this.f15263id = num2;
        this.likes = baseObjectCount2;
        this.pageId = str2;
        this.photo = str3;
        this.title = str4;
        this.url = str5;
    }

    public /* synthetic */ WidgetsWidgetPage(BaseObjectCount baseObjectCount, Integer num, String str, Integer num2, BaseObjectCount baseObjectCount2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseObjectCount, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseObjectCount2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }
}
