package io.sentry.android.replay.util;

import android.graphics.Rect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
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
@Metadata
public final class NodesKt {
    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates, @Nullable LayoutCoordinates layoutCoordinates2) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = layoutCoordinates2 == null ? LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates) : layoutCoordinates2;
        float f10 = (int) (layoutCoordinatesFindRootCoordinates.getSize-YbymL2g() >> 32);
        float f11 = (int) (layoutCoordinatesFindRootCoordinates.getSize-YbymL2g() & 4294967295L);
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf = layoutCoordinatesFindRootCoordinates.localBoundingBoxOf(layoutCoordinates, true);
        float left = rectLocalBoundingBoxOf.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > f10) {
            left = f10;
        }
        float top = rectLocalBoundingBoxOf.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > f11) {
            top = f11;
        }
        float right = rectLocalBoundingBoxOf.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= f10) {
            f10 = right;
        }
        float bottom = rectLocalBoundingBoxOf.getBottom();
        float f12 = bottom >= 0.0f ? bottom : 0.0f;
        if (f12 <= f11) {
            f11 = f12;
        }
        if (left == f10 || top == f11) {
            return new Rect();
        }
        long j10 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long j11 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L)));
        long j12 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32)));
        long j13 = layoutCoordinatesFindRootCoordinates.localToWindow-MK-Hz9U(Offset.constructor-impl((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j12 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return new Rect((int) fMin, (int) Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), (int) fMax, (int) Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    private static final float fastCoerceAtLeast(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    private static final float fastCoerceAtMost(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    private static final float fastCoerceIn(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private static final float fastMaxOf(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    private static final float fastMinOf(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    @Nullable
    public static final Painter findPainter(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        for (int i = 0; i < size; i++) {
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            String name = modifier.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.y(name, "Painter", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    if (obj instanceof Painter) {
                        return (Painter) obj;
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final Color findTextColor(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        List modifierInfo = layoutNode.getModifierInfo();
        int size = modifierInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Modifier modifier = ((ModifierInfo) modifierInfo.get(i)).getModifier();
            if (StringsKt.y(modifier.getClass().getName(), "Text", false)) {
                try {
                    Field declaredField = modifier.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(modifier);
                    ColorProducer colorProducer = obj instanceof ColorProducer ? (ColorProducer) obj : null;
                    if (colorProducer != null) {
                        return Color.box-impl(colorProducer.invoke-0d7_KjU());
                    }
                } catch (Throwable unused) {
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public static final boolean isMaskable(@NotNull Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<this>");
        String name = painter.getClass().getName();
        return (StringsKt.y(name, "Vector", false) || StringsKt.y(name, "Color", false) || StringsKt.y(name, "Brush", false)) ? false : true;
    }
}
