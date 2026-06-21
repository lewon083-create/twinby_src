package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import ij.g;
import ij.h;
import ij.i;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryMaskingOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.ComposeTextLayout;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class ComposeViewHierarchyNode {

    @Nullable
    private static WeakReference<LayoutCoordinates> _rootCoordinates;
    private static boolean semanticsRetrievalErrorLogged;

    @NotNull
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();

    @NotNull
    private static final g getCollapsedSemanticsMethod$delegate = h.a(i.f21338c, ComposeViewHierarchyNode$getCollapsedSemanticsMethod$2.INSTANCE);
    public static final int $stable = 8;

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, int i, boolean z5, SentryMaskingOptions sentryMaskingOptions, ILogger iLogger) {
        ComposeTextLayout composeTextLayout;
        Integer numValueOf;
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z5) {
            _rootCoordinates = new WeakReference<>(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference<LayoutCoordinates> weakReference = _rootCoordinates;
        Rect rectBoundsInWindow = NodesKt.boundsInWindow(coordinates, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release = retrieveSemanticsConfiguration$sentry_android_replay_release(layoutNode);
            boolean z10 = !SentryLayoutNodeHelper.INSTANCE.isTransparent(layoutNode) && (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0;
            boolean z11 = (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getText())) && !z11) {
                Painter painterFindPainter = NodesKt.findPainter(layoutNode);
                if (painterFindPainter == null) {
                    boolean z12 = false;
                    if (z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryMaskingOptions)) {
                        z12 = true;
                    }
                    return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i, viewHierarchyNode, z12, false, z10, rectBoundsInWindow);
                }
                boolean z13 = z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, true, sentryMaskingOptions);
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                float f10 = rectBoundsInWindow.left;
                float f11 = rectBoundsInWindow.top;
                boolean z14 = false;
                int width = layoutNode.getWidth();
                int height = layoutNode.getHeight();
                float elevation = viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f;
                if (z13 && NodesKt.isMaskable(painterFindPainter)) {
                    z14 = true;
                }
                return new ViewHierarchyNode.ImageViewHierarchyNode(f10, f11, width, height, elevation, i, viewHierarchyNode, z14, true, z10, rectBoundsInWindow);
            }
            boolean z15 = z10 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryMaskingOptions);
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ArrayList arrayList = new ArrayList();
            if (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull(arrayList);
            Color colorFindTextColor = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
            if (colorFindTextColor != null && colorFindTextColor.unbox-impl() == 16) {
                colorFindTextColor = NodesKt.findTextColor(layoutNode);
            }
            TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
            ComposeTextLayout composeTextLayout2 = (textLayoutResult == null || z11 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new ComposeTextLayout(textLayoutResult);
            if (colorFindTextColor != null) {
                composeTextLayout = composeTextLayout2;
                numValueOf = Integer.valueOf(ViewsKt.toOpaque(ColorKt.toArgb-8_81llA(colorFindTextColor.unbox-impl())));
            } else {
                composeTextLayout = composeTextLayout2;
                numValueOf = null;
            }
            return new ViewHierarchyNode.TextViewHierarchyNode(composeTextLayout, numValueOf, 0, 0, rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i, viewHierarchyNode, z15, true, z10, rectBoundsInWindow, 12, null);
        } catch (Throwable th2) {
            if (!semanticsRetrievalErrorLogged) {
                semanticsRetrievalErrorLogged = true;
                iLogger.log(SentryLevel.ERROR, th2, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i, viewHierarchyNode, true, false, !SentryLayoutNodeHelper.INSTANCE.isTransparent(layoutNode) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0, rectBoundsInWindow);
        }
    }

    private final Method getGetCollapsedSemanticsMethod() {
        return (Method) getCollapsedSemanticsMethod$delegate.getValue();
    }

    private final String getProxyClassName(boolean z5, SemanticsConfiguration semanticsConfiguration) {
        return z5 ? SentryMaskingOptions.IMAGE_VIEW_CLASS_NAME : semanticsConfiguration != null ? (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) ? SentryMaskingOptions.TEXT_VIEW_CLASS_NAME : "android.view.View" : "android.view.View";
    }

    @Nullable
    public static final SemanticsConfiguration retrieveSemanticsConfiguration$sentry_android_replay_release(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        try {
            return node.getSemanticsConfiguration();
        } catch (Throwable th2) {
            if (INSTANCE.getGetCollapsedSemanticsMethod() == null) {
                throw th2;
            }
            Method getCollapsedSemanticsMethod = INSTANCE.getGetCollapsedSemanticsMethod();
            Intrinsics.b(getCollapsedSemanticsMethod);
            return (SemanticsConfiguration) getCollapsedSemanticsMethod.invoke(node, null);
        }
    }

    private final boolean shouldMask(SemanticsConfiguration semanticsConfiguration, boolean z5, SentryMaskingOptions sentryMaskingOptions) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (Intrinsics.a(str, "unmask")) {
            sentryMaskingOptions.trackCustomMasking();
            return false;
        }
        if (Intrinsics.a(str, "mask")) {
            sentryMaskingOptions.trackCustomMasking();
            return true;
        }
        String proxyClassName = getProxyClassName(z5, semanticsConfiguration);
        if (sentryMaskingOptions.getUnmaskViewClasses().contains(proxyClassName)) {
            return false;
        }
        return sentryMaskingOptions.getMaskViewClasses().contains(proxyClassName);
    }

    private final void traverse(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, boolean z5, SentryMaskingOptions sentryMaskingOptions, ILogger iLogger) throws IllegalAccessException, InvocationTargetException {
        List<LayoutNode> children = SentryLayoutNodeHelper.INSTANCE.getChildren(layoutNode);
        if (children.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children.size());
        int size = children.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = children.get(i);
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = fromComposeNode(layoutNode2, viewHierarchyNode, i, z5, sentryMaskingOptions, iLogger);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                traverse(layoutNode2, viewHierarchyNodeFromComposeNode, false, sentryMaskingOptions, iLogger);
            }
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    public final boolean fromView(@NotNull View view, @Nullable ViewHierarchyNode viewHierarchyNode, @NotNull SentryMaskingOptions options, @NotNull ILogger logger) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        StringsKt.y(name, "AndroidComposeView", false);
        return false;
    }

    private static /* synthetic */ void get_rootCoordinates$annotations() {
    }
}
