package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Feedback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class NativeAdViewBinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f15306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15307b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, map);
    }

    @Nullable
    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @NotNull
    public Map<String, View> getAssetViews() {
        return this.f15307b;
    }

    @Nullable
    public TextView getBodyView() {
        View view = getAssetViews().get(SentryLogEvent.JsonKeys.BODY);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getDomainView() {
        View view = getAssetViews().get("domain");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getFeedbackView() {
        View view = getAssetViews().get(Feedback.TYPE);
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public MediaView getMediaView() {
        View view = getAssetViews().get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.f15306a;
    }

    @Nullable
    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    @Nullable
    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    private NativeAdViewBinder(View view, Map map) {
        this.f15306a = view;
        this.f15307b = map;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f15308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f15309b;

        public Builder(@NotNull View view) {
            this.f15308a = view;
            this.f15309b = new LinkedHashMap();
        }

        @NotNull
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f15308a, this.f15309b, null);
        }

        @NotNull
        public final Builder setBodyView(@Nullable TextView textView) {
            this.f15309b.put(SentryLogEvent.JsonKeys.BODY, textView);
            return this;
        }

        @NotNull
        public final Builder setCallToActionView(@Nullable TextView textView) {
            this.f15309b.put("call_to_action", textView);
            return this;
        }

        @NotNull
        public final Builder setDomainView(@Nullable TextView textView) {
            this.f15309b.put("domain", textView);
            return this;
        }

        @NotNull
        public final Builder setFeedbackView(@Nullable ImageView imageView) {
            this.f15309b.put(Feedback.TYPE, imageView);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView imageView) {
            this.f15309b.put("icon", imageView);
            return this;
        }

        @NotNull
        public final Builder setMediaView(@Nullable MediaView mediaView) {
            this.f15309b.put("media", mediaView);
            return this;
        }

        @NotNull
        public final Builder setPriceView(@Nullable TextView textView) {
            this.f15309b.put("price", textView);
            return this;
        }

        @NotNull
        public final Builder setSponsoredView(@Nullable TextView textView) {
            this.f15309b.put("sponsored", textView);
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable TextView textView) {
            this.f15309b.put("title", textView);
            return this;
        }

        @NotNull
        public final Builder setWarningView(@Nullable TextView textView) {
            this.f15309b.put("warning", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
            Intrinsics.c(nativeAdView, "null cannot be cast to non-null type android.view.View");
        }
    }
}
