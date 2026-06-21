package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import ij.g;
import ij.h;
import ij.i;
import java.lang.reflect.Field;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata
@SuppressLint({"PrivateApi"})
public final class WindowSpy {
    public static final int $stable;

    @NotNull
    public static final WindowSpy INSTANCE = new WindowSpy();

    @NotNull
    private static final g decorViewClass$delegate;

    @NotNull
    private static final g windowField$delegate;

    static {
        i iVar = i.f21338c;
        decorViewClass$delegate = h.a(iVar, WindowSpy$decorViewClass$2.INSTANCE);
        windowField$delegate = h.a(iVar, WindowSpy$windowField$2.INSTANCE);
        $stable = 8;
    }

    private WindowSpy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> getDecorViewClass() {
        return (Class) decorViewClass$delegate.getValue();
    }

    private final Field getWindowField() {
        return (Field) windowField$delegate.getValue();
    }

    @Nullable
    public final Window pullWindow(@NotNull View maybeDecorView) throws IllegalAccessException {
        Field windowField;
        Intrinsics.checkNotNullParameter(maybeDecorView, "maybeDecorView");
        Class<?> decorViewClass = getDecorViewClass();
        if (decorViewClass == null || !decorViewClass.isInstance(maybeDecorView) || (windowField = INSTANCE.getWindowField()) == null) {
            return null;
        }
        Object obj = windowField.get(maybeDecorView);
        Intrinsics.c(obj, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj;
    }
}
