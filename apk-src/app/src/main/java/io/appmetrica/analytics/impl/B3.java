package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class B3 extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(@NotNull C0474s3 c0474s3, @NotNull C0474s3 c0474s32) {
        if (ko.a(c0474s32.f24724a)) {
            return true;
        }
        if (ko.a(c0474s3.f24724a)) {
            return false;
        }
        T7 t72 = c0474s3.f24725b;
        if (t72 == T7.f23005c) {
            if (((Number) this.f22948a.a(t72)).intValue() >= ((Number) this.f22948a.a(c0474s32.f24725b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f22948a.a(t72)).intValue() > ((Number) this.f22948a.a(c0474s32.f24725b)).intValue()) {
            return true;
        }
        return false;
    }
}
