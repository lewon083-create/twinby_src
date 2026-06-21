package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonAction;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NewsfeedExpertCardWidget {

    @b("action")
    @Nullable
    private final BaseLinkButtonAction action;

    @b("rating")
    @Nullable
    private final NewsfeedExpertCardWidgetRating rating;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @Nullable
    private final String title;

    public NewsfeedExpertCardWidget() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NewsfeedExpertCardWidget copy$default(NewsfeedExpertCardWidget newsfeedExpertCardWidget, NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating, String str, String str2, BaseLinkButtonAction baseLinkButtonAction, int i, Object obj) {
        if ((i & 1) != 0) {
            newsfeedExpertCardWidgetRating = newsfeedExpertCardWidget.rating;
        }
        if ((i & 2) != 0) {
            str = newsfeedExpertCardWidget.title;
        }
        if ((i & 4) != 0) {
            str2 = newsfeedExpertCardWidget.subtitle;
        }
        if ((i & 8) != 0) {
            baseLinkButtonAction = newsfeedExpertCardWidget.action;
        }
        return newsfeedExpertCardWidget.copy(newsfeedExpertCardWidgetRating, str, str2, baseLinkButtonAction);
    }

    @Nullable
    public final NewsfeedExpertCardWidgetRating component1() {
        return this.rating;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.subtitle;
    }

    @Nullable
    public final BaseLinkButtonAction component4() {
        return this.action;
    }

    @NotNull
    public final NewsfeedExpertCardWidget copy(@Nullable NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating, @Nullable String str, @Nullable String str2, @Nullable BaseLinkButtonAction baseLinkButtonAction) {
        return new NewsfeedExpertCardWidget(newsfeedExpertCardWidgetRating, str, str2, baseLinkButtonAction);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidget)) {
            return false;
        }
        NewsfeedExpertCardWidget newsfeedExpertCardWidget = (NewsfeedExpertCardWidget) obj;
        return Intrinsics.a(this.rating, newsfeedExpertCardWidget.rating) && Intrinsics.a(this.title, newsfeedExpertCardWidget.title) && Intrinsics.a(this.subtitle, newsfeedExpertCardWidget.subtitle) && Intrinsics.a(this.action, newsfeedExpertCardWidget.action);
    }

    @Nullable
    public final BaseLinkButtonAction getAction() {
        return this.action;
    }

    @Nullable
    public final NewsfeedExpertCardWidgetRating getRating() {
        return this.rating;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating = this.rating;
        int iHashCode = (newsfeedExpertCardWidgetRating == null ? 0 : newsfeedExpertCardWidgetRating.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseLinkButtonAction baseLinkButtonAction = this.action;
        return iHashCode3 + (baseLinkButtonAction != null ? baseLinkButtonAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedExpertCardWidget(rating=" + this.rating + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ")";
    }

    public NewsfeedExpertCardWidget(@Nullable NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating, @Nullable String str, @Nullable String str2, @Nullable BaseLinkButtonAction baseLinkButtonAction) {
        this.rating = newsfeedExpertCardWidgetRating;
        this.title = str;
        this.subtitle = str2;
        this.action = baseLinkButtonAction;
    }

    public /* synthetic */ NewsfeedExpertCardWidget(NewsfeedExpertCardWidgetRating newsfeedExpertCardWidgetRating, String str, String str2, BaseLinkButtonAction baseLinkButtonAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : newsfeedExpertCardWidgetRating, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : baseLinkButtonAction);
    }
}
