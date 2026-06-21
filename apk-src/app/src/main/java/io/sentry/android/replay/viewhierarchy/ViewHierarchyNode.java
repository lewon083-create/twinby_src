package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryMaskingOptions;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
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
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public abstract class ViewHierarchyNode {

    @NotNull
    private static final String SENTRY_MASK_TAG = "sentry-mask";

    @NotNull
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";

    @Nullable
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;

    @Nullable
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;

    @Nullable
    private final Rect visibleRect;
    private final int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f26005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f26006y;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, SentryMaskingOptions sentryMaskingOptions) {
            String maskViewContainerClass = sentryMaskingOptions.getMaskViewContainerClass();
            if (maskViewContainerClass == null) {
                return false;
            }
            return view.getClass().getName().equals(maskViewContainerClass);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, SentryMaskingOptions sentryMaskingOptions) {
            String unmaskViewContainerClass = sentryMaskingOptions.getUnmaskViewContainerClass();
            if (unmaskViewContainerClass == null) {
                return false;
            }
            return viewParent.getClass().getName().equals(unmaskViewContainerClass);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean shouldMask(android.view.View r8, io.sentry.SentryMaskingOptions r9) {
            /*
                r7 = this;
                java.lang.Object r0 = r8.getTag()
                boolean r1 = r0 instanceof java.lang.String
                r2 = 0
                if (r1 == 0) goto Lc
                java.lang.String r0 = (java.lang.String) r0
                goto Ld
            Lc:
                r0 = r2
            Ld:
                java.lang.String r1 = "toLowerCase(...)"
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L27
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                if (r0 == 0) goto L27
                java.lang.String r5 = "sentry-unmask"
                boolean r0 = kotlin.text.StringsKt.y(r0, r5, r4)
                if (r0 != r3) goto L27
                goto L35
            L27:
                int r0 = io.sentry.android.replay.R.id.sentry_privacy
                java.lang.Object r5 = r8.getTag(r0)
                java.lang.String r6 = "unmask"
                boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r6)
                if (r5 == 0) goto L39
            L35:
                r9.trackCustomMasking()
                return r4
            L39:
                java.lang.Object r5 = r8.getTag()
                boolean r6 = r5 instanceof java.lang.String
                if (r6 == 0) goto L44
                r2 = r5
                java.lang.String r2 = (java.lang.String) r2
            L44:
                if (r2 == 0) goto L5a
                java.util.Locale r5 = java.util.Locale.ROOT
                java.lang.String r2 = r2.toLowerCase(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
                if (r2 == 0) goto L5a
                java.lang.String r1 = "sentry-mask"
                boolean r1 = kotlin.text.StringsKt.y(r2, r1, r4)
                if (r1 != r3) goto L5a
                goto L66
            L5a:
                java.lang.Object r0 = r8.getTag(r0)
                java.lang.String r1 = "mask"
                boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
                if (r0 == 0) goto L6a
            L66:
                r9.trackCustomMasking()
                return r3
            L6a:
                boolean r0 = r7.isMaskContainer(r8, r9)
                if (r0 != 0) goto L86
                android.view.ViewParent r0 = r8.getParent()
                if (r0 == 0) goto L86
                android.view.ViewParent r0 = r8.getParent()
                java.lang.String r1 = "getParent(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r0 = r7.isUnmaskContainer(r0, r9)
                if (r0 == 0) goto L86
                goto L99
            L86:
                java.lang.Class r0 = r8.getClass()
                java.util.Set r1 = r9.getUnmaskViewClasses()
                java.lang.String r2 = "getUnmaskViewClasses(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                boolean r0 = r7.isAssignableFrom(r0, r1)
                if (r0 == 0) goto L9a
            L99:
                return r4
            L9a:
                java.lang.Class r8 = r8.getClass()
                java.util.Set r9 = r9.getMaskViewClasses()
                java.lang.String r0 = "getMaskViewClasses(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
                boolean r8 = r7.isAssignableFrom(r8, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.Companion.shouldMask(android.view.View, io.sentry.SentryMaskingOptions):boolean");
        }

        @NotNull
        public final ViewHierarchyNode fromView(@NotNull View view, @Nullable ViewHierarchyNode viewHierarchyNode, int i, @NotNull SentryMaskingOptions options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair<Boolean, Rect> pairIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = ((Boolean) pairIsVisibleToUser.f27469b).booleanValue();
            Rect rect = (Rect) pairIsVisibleToUser.f27470c;
            boolean z5 = zBooleanValue && shouldMask(view, options);
            if (!(view instanceof TextView)) {
                if (view instanceof ImageView) {
                    if (viewHierarchyNode != null) {
                        viewHierarchyNode.setImportantForCaptureToAncestors(true);
                    }
                    ImageView imageView = (ImageView) view;
                    return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i, viewHierarchyNode, z5 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rect);
                }
                if (!(view instanceof SurfaceView)) {
                    return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f) + view.getElevation(), i, viewHierarchyNode, z5, false, zBooleanValue, rect);
                }
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                SurfaceView surfaceView = (SurfaceView) view;
                return new SurfaceViewHierarchyNode(new WeakReference(view), surfaceView.getX(), surfaceView.getY(), surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i, viewHierarchyNode, z5, true, zBooleanValue, rect);
            }
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            AndroidTextLayout androidTextLayout = layout != null ? new AndroidTextLayout(layout) : null;
            int opaque = ViewsKt.toOpaque(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTopSafe = ViewsKt.getTotalPaddingTopSafe(textView);
            float x10 = textView.getX();
            float y7 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (viewHierarchyNode != null) {
                elevation = viewHierarchyNode.getElevation();
            }
            return new TextViewHierarchyNode(androidTextLayout, Integer.valueOf(opaque), totalPaddingLeft, totalPaddingTopSafe, x10, y7, width, height, elevation + textView.getElevation(), i, viewHierarchyNode, z5, true, zBooleanValue, rect);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 0)
    @Metadata
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ GenericViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i, i10, f12, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & 128) != 0 ? false : z5, (i12 & 256) != 0 ? false : z10, (i12 & 512) != 0 ? false : z11, (i12 & 1024) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, @Nullable Rect rect) {
            super(f10, f11, i, i10, f12, i11, viewHierarchyNode, z5, z10, z11, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 0)
    @Metadata
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        public /* synthetic */ ImageViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, i, i10, f12, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & 128) != 0 ? false : z5, (i12 & 256) != 0 ? false : z10, (i12 & 512) != 0 ? false : z11, (i12 & 1024) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, @Nullable Rect rect) {
            super(f10, f11, i, i10, f12, i11, viewHierarchyNode, z5, z10, z11, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class LCAResult {

        @Nullable
        private final ViewHierarchyNode lca;

        @Nullable
        private ViewHierarchyNode nodeSubtree;

        @Nullable
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(@Nullable ViewHierarchyNode viewHierarchyNode, @Nullable ViewHierarchyNode viewHierarchyNode2, @Nullable ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i, Object obj) {
            if ((i & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        @Nullable
        public final ViewHierarchyNode component1() {
            return this.lca;
        }

        @Nullable
        public final ViewHierarchyNode component2() {
            return this.nodeSubtree;
        }

        @Nullable
        public final ViewHierarchyNode component3() {
            return this.otherNodeSubtree;
        }

        @NotNull
        public final LCAResult copy(@Nullable ViewHierarchyNode viewHierarchyNode, @Nullable ViewHierarchyNode viewHierarchyNode2, @Nullable ViewHierarchyNode viewHierarchyNode3) {
            return new LCAResult(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) obj;
            return Intrinsics.a(this.lca, lCAResult.lca) && Intrinsics.a(this.nodeSubtree, lCAResult.nodeSubtree) && Intrinsics.a(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        @Nullable
        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        @Nullable
        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        @Nullable
        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(@Nullable ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        @NotNull
        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 0)
    @Metadata
    public static final class SurfaceViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        @NotNull
        private final WeakReference<SurfaceView> surfaceViewRef;

        public /* synthetic */ SurfaceViewHierarchyNode(WeakReference weakReference, float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(weakReference, f10, f11, i, i10, f12, i11, (i12 & 128) != 0 ? null : viewHierarchyNode, (i12 & 256) != 0 ? false : z5, (i12 & 512) != 0 ? false : z10, (i12 & 1024) != 0 ? false : z11, (i12 & 2048) != 0 ? null : rect);
        }

        @NotNull
        public final WeakReference<SurfaceView> getSurfaceViewRef() {
            return this.surfaceViewRef;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SurfaceViewHierarchyNode(@NotNull WeakReference<SurfaceView> surfaceViewRef, float f10, float f11, int i, int i10, float f12, int i11, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, @Nullable Rect rect) {
            super(f10, f11, i, i10, f12, i11, viewHierarchyNode, z5, z10, z11, rect, null);
            Intrinsics.checkNotNullParameter(surfaceViewRef, "surfaceViewRef");
            this.surfaceViewRef = surfaceViewRef;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @StabilityInferred(parameters = 0)
    @Metadata
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;

        @Nullable
        private final Integer dominantColor;

        @Nullable
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i, int i10, float f10, float f11, int i11, int i12, float f12, int i13, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? null : textLayout, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? 0 : i, (i14 & 8) != 0 ? 0 : i10, f10, f11, i11, i12, f12, i13, (i14 & 1024) != 0 ? null : viewHierarchyNode, (i14 & 2048) != 0 ? false : z5, (i14 & 4096) != 0 ? false : z10, (i14 & 8192) != 0 ? false : z11, (i14 & 16384) != 0 ? null : rect);
        }

        @Nullable
        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        @Nullable
        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public TextViewHierarchyNode(@Nullable TextLayout textLayout, @Nullable Integer num, int i, int i10, float f10, float f11, int i11, int i12, float f12, int i13, @Nullable ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, @Nullable Rect rect) {
            super(f10, f11, i11, i12, f12, i13, viewHierarchyNode, z5, z10, z11, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i;
            this.paddingTop = i10;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode$isObscured$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function1<ViewHierarchyNode, Boolean> {
        final /* synthetic */ d0 $isObscured;
        final /* synthetic */ ViewHierarchyNode $node;
        final /* synthetic */ ViewHierarchyNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d0 d0Var, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
            super(1);
            this.$isObscured = d0Var;
            this.$node = viewHierarchyNode;
            this.this$0 = viewHierarchyNode2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ViewHierarchyNode otherNode) {
            Intrinsics.checkNotNullParameter(otherNode, "otherNode");
            if (otherNode.getVisibleRect() == null || this.$isObscured.f27507b) {
                return Boolean.FALSE;
            }
            if (!otherNode.isVisible() || !otherNode.isImportantForContentCapture() || !otherNode.getVisibleRect().contains(this.$node.getVisibleRect())) {
                return Boolean.FALSE;
            }
            if (otherNode.getElevation() > this.$node.getElevation()) {
                this.$isObscured.f27507b = true;
                return Boolean.FALSE;
            }
            if (otherNode.getElevation() == this.$node.getElevation()) {
                LCAResult lCAResultFindLCA = this.this$0.findLCA(this.$node, otherNode);
                ViewHierarchyNode viewHierarchyNodeComponent1 = lCAResultFindLCA.component1();
                ViewHierarchyNode viewHierarchyNodeComponent2 = lCAResultFindLCA.component2();
                ViewHierarchyNode viewHierarchyNodeComponent3 = lCAResultFindLCA.component3();
                if (!Intrinsics.a(viewHierarchyNodeComponent1, otherNode) && viewHierarchyNodeComponent3 != null && viewHierarchyNodeComponent2 != null) {
                    this.$isObscured.f27507b = viewHierarchyNodeComponent3.getDistance() > viewHierarchyNodeComponent2.getDistance();
                    return Boolean.valueOf(!this.$isObscured.f27507b);
                }
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i, i10, f12, i11, viewHierarchyNode, z5, z10, z11, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
        ViewHierarchyNode viewHierarchyNode3 = null;
        ViewHierarchyNode viewHierarchyNode4 = equals(viewHierarchyNode) ? this : null;
        ViewHierarchyNode viewHierarchyNode5 = equals(viewHierarchyNode2) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            Intrinsics.b(list);
            for (ViewHierarchyNode viewHierarchyNode6 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode6.findLCA(viewHierarchyNode, viewHierarchyNode2);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode4 = viewHierarchyNode6;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode5 = viewHierarchyNode6;
                }
            }
        }
        if (viewHierarchyNode4 != null && viewHierarchyNode5 != null) {
            viewHierarchyNode3 = this;
        }
        return new LCAResult(viewHierarchyNode3, viewHierarchyNode4, viewHierarchyNode5);
    }

    @NotNull
    public static final ViewHierarchyNode fromView(@NotNull View view, @Nullable ViewHierarchyNode viewHierarchyNode, int i, @NotNull SentryMaskingOptions sentryMaskingOptions) {
        return Companion.fromView(view, viewHierarchyNode, i, sentryMaskingOptions);
    }

    @Nullable
    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    @Nullable
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f26005x;
    }

    public final float getY() {
        return this.f26006y;
    }

    public final boolean isImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(@NotNull ViewHierarchyNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
        }
        if (node.visibleRect == null) {
            return false;
        }
        d0 d0Var = new d0();
        traverse(new AnonymousClass2(d0Var, node, this));
        return d0Var.f27507b;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setChildren(@Nullable List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean z5) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = z5;
        }
    }

    public final void setImportantForContentCapture(boolean z5) {
        this.isImportantForContentCapture = z5;
    }

    public final void traverse(@NotNull Function1<? super ViewHierarchyNode, Boolean> callback) {
        List<? extends ViewHierarchyNode> list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.children) == null) {
            return;
        }
        Intrinsics.b(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(callback);
        }
    }

    private ViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect) {
        this.f26005x = f10;
        this.f26006y = f11;
        this.width = i;
        this.height = i10;
        this.elevation = f12;
        this.distance = i11;
        this.parent = viewHierarchyNode;
        this.shouldMask = z5;
        this.isImportantForContentCapture = z10;
        this.isVisible = z11;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f10, float f11, int i, int i10, float f12, int i11, ViewHierarchyNode viewHierarchyNode, boolean z5, boolean z10, boolean z11, Rect rect, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i, i10, f12, i11, (i12 & 64) != 0 ? null : viewHierarchyNode, (i12 & 128) != 0 ? false : z5, (i12 & 256) != 0 ? false : z10, (i12 & 512) != 0 ? false : z11, (i12 & 1024) != 0 ? null : rect, null);
    }
}
