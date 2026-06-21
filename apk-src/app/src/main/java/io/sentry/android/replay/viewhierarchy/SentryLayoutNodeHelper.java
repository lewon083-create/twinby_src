package io.sentry.android.replay.viewhierarchy;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import ij.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
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
@StabilityInferred(parameters = 0)
@Metadata
public final class SentryLayoutNodeHelper {

    @Nullable
    private static Fallback fallback;

    @Nullable
    private static Boolean useFallback;

    @NotNull
    public static final SentryLayoutNodeHelper INSTANCE = new SentryLayoutNodeHelper();
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Fallback {

        @Nullable
        private final Method getChildren;

        @Nullable
        private final Method getOuterCoordinator;

        public Fallback(@Nullable Method method, @Nullable Method method2) {
            this.getChildren = method;
            this.getOuterCoordinator = method2;
        }

        @Nullable
        public final Method getGetChildren() {
            return this.getChildren;
        }

        @Nullable
        public final Method getGetOuterCoordinator() {
            return this.getOuterCoordinator;
        }
    }

    private SentryLayoutNodeHelper() {
    }

    private final Fallback getFallback() {
        Fallback fallback2 = fallback;
        if (fallback2 != null) {
            return fallback2;
        }
        Fallback fallback3 = new Fallback(tryResolve(LayoutNode.class, "getChildren$ui_release"), tryResolve(LayoutNode.class, "getOuterCoordinator$ui_release"));
        fallback = fallback3;
        return fallback3;
    }

    private final Method tryResolve(Class<?> cls, String str) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @NotNull
    public final List<LayoutNode> getChildren(@NotNull LayoutNode node) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(node, "node");
        Boolean bool = useFallback;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.a(bool, bool2)) {
            return node.getChildren$ui();
        }
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            Method getChildren = getFallback().getGetChildren();
            Intrinsics.b(getChildren);
            Object objInvoke = getChildren.invoke(node, null);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) objInvoke;
        }
        if (bool != null) {
            throw new j();
        }
        try {
            List<LayoutNode> children$ui = node.getChildren$ui();
            useFallback = bool2;
            return children$ui;
        } catch (NoSuchMethodError unused) {
            useFallback = Boolean.TRUE;
            Method getChildren2 = getFallback().getGetChildren();
            Intrinsics.b(getChildren2);
            Object objInvoke2 = getChildren2.invoke(node, null);
            Intrinsics.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) objInvoke2;
        }
    }

    public final boolean isTransparent(@NotNull LayoutNode node) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(node, "node");
        Boolean bool = useFallback;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.a(bool, bool2)) {
            return node.getOuterCoordinator$ui().isTransparent();
        }
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            Method getOuterCoordinator = getFallback().getGetOuterCoordinator();
            Intrinsics.b(getOuterCoordinator);
            Object objInvoke = getOuterCoordinator.invoke(node, null);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) objInvoke).isTransparent();
        }
        if (bool != null) {
            throw new j();
        }
        try {
            boolean zIsTransparent = node.getOuterCoordinator$ui().isTransparent();
            useFallback = bool2;
            return zIsTransparent;
        } catch (NoSuchMethodError unused) {
            useFallback = Boolean.TRUE;
            Method getOuterCoordinator2 = getFallback().getGetOuterCoordinator();
            Intrinsics.b(getOuterCoordinator2);
            Object objInvoke2 = getOuterCoordinator2.invoke(node, null);
            Intrinsics.c(objInvoke2, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) objInvoke2).isTransparent();
        }
    }
}
