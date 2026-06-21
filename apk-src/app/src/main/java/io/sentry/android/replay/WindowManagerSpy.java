package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class WindowManagerSpy {
    public static final int $stable;

    @NotNull
    public static final WindowManagerSpy INSTANCE = new WindowManagerSpy();

    @NotNull
    private static final g mViewsField$delegate;

    @NotNull
    private static final g windowManagerClass$delegate;

    @NotNull
    private static final g windowManagerInstance$delegate;

    static {
        i iVar = i.f21338c;
        windowManagerClass$delegate = h.a(iVar, WindowManagerSpy$windowManagerClass$2.INSTANCE);
        windowManagerInstance$delegate = h.a(iVar, WindowManagerSpy$windowManagerInstance$2.INSTANCE);
        mViewsField$delegate = h.a(iVar, WindowManagerSpy$mViewsField$2.INSTANCE);
        $stable = 8;
    }

    private WindowManagerSpy() {
    }

    private final Field getMViewsField() {
        return (Field) mViewsField$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getWindowManagerClass() {
        return (Class) windowManagerClass$delegate.getValue();
    }

    private final Object getWindowManagerInstance() {
        return windowManagerInstance$delegate.getValue();
    }

    @SuppressLint({"PrivateApi", "ObsoleteSdkInt", "DiscouragedPrivateApi"})
    public final void swapWindowManagerGlobalMViews(@NotNull Function1<? super ArrayList<View>, ? extends ArrayList<View>> swap) {
        Field mViewsField;
        Intrinsics.checkNotNullParameter(swap, "swap");
        try {
            Object windowManagerInstance = getWindowManagerInstance();
            if (windowManagerInstance == null || (mViewsField = INSTANCE.getMViewsField()) == null) {
                return;
            }
            Object obj = mViewsField.get(windowManagerInstance);
            Intrinsics.c(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
            mViewsField.set(windowManagerInstance, swap.invoke((ArrayList) obj));
        } catch (Throwable th2) {
            Log.w("WindowManagerSpy", th2);
        }
    }
}
