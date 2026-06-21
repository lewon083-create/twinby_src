package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V4 extends U4 {
    public V4(@NotNull Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.U4
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.U4
    public final void c() {
        Ve ve2 = this.f23059a.f23284c;
        try {
            Tk tk2 = new Tk(ve2, A2.f22054g);
            Long lA = tk2.f23037c.a(Tk.f23030d);
            if (lA != null) {
                tk2.a(Tk.f23030d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA.longValue())));
            }
            Long lA2 = tk2.f23037c.a(Tk.f23031e);
            if (lA2 != null) {
                tk2.a(Tk.f23031e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Tk tk3 = new Tk(ve2, C0232ia.f24064g);
            Long lA3 = tk3.f23037c.a(Tk.f23030d);
            if (lA3 != null) {
                tk3.a(Tk.f23030d, Long.valueOf(TimeUnit.SECONDS.toMillis(lA3.longValue())));
            }
            Long lA4 = tk3.f23037c.a(Tk.f23031e);
            if (lA4 != null) {
                tk3.a(Tk.f23031e, Long.valueOf(TimeUnit.SECONDS.toMillis(lA4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
