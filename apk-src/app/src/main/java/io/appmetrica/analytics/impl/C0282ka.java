package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0282ka implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    @Nullable
    public final C0024a9 a(@Nullable C0254j7 c0254j7) {
        C0024a9 c0024a9 = null;
        if ((c0254j7 != null ? c0254j7.f24132b : null) != null && c0254j7.f24133c != null) {
            c0024a9 = new C0024a9();
            c0024a9.f23417b = c0254j7.f24132b.doubleValue();
            c0024a9.f23416a = c0254j7.f24133c.doubleValue();
            Integer num = c0254j7.f24134d;
            if (num != null) {
                c0024a9.f23422g = num.intValue();
            }
            Integer num2 = c0254j7.f24135e;
            if (num2 != null) {
                c0024a9.f23420e = num2.intValue();
            }
            Integer num3 = c0254j7.f24136f;
            if (num3 != null) {
                c0024a9.f23419d = num3.intValue();
            }
            Integer num4 = c0254j7.f24137g;
            if (num4 != null) {
                c0024a9.f23421f = num4.intValue();
            }
            Long l10 = c0254j7.f24138h;
            if (l10 != null) {
                c0024a9.f23418c = TimeUnit.MILLISECONDS.toSeconds(l10.longValue());
            }
            String str = c0254j7.i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0024a9.f23423h = 1;
                } else if (str.equals("network")) {
                    c0024a9.f23423h = 2;
                }
            }
            String str2 = c0254j7.f24139j;
            if (str2 != null) {
                c0024a9.i = str2;
            }
        }
        return c0024a9;
    }
}
