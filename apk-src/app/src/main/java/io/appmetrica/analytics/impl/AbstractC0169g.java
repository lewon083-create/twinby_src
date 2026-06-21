package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0169g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f23912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pk f23913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Tk f23914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ok f23915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sa f23916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f23917f;

    public AbstractC0169g(@NonNull Y4 y42, @NonNull Pk pk2, @NonNull Tk tk2, @NonNull Ok ok2, @NonNull Sa sa, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f23912a = y42;
        this.f23913b = pk2;
        this.f23914c = tk2;
        this.f23915d = ok2;
        this.f23916e = sa;
        this.f23917f = systemTimeProvider;
    }

    @NonNull
    public final /* bridge */ Ck a(@NonNull Object obj) {
        return a((Dk) obj);
    }

    public final Ck b() {
        if (this.f23914c.h()) {
            return new Ck(this.f23912a, this.f23914c, a(), this.f23917f);
        }
        return null;
    }

    @NonNull
    public final Ck a(@NonNull Dk dk2) {
        if (this.f23914c.h()) {
            this.f23916e.reportEvent("create session with non-empty storage");
        }
        Y4 y42 = this.f23912a;
        Tk tk2 = this.f23914c;
        long jA = this.f23913b.a();
        Tk tk3 = this.f23914c;
        tk3.a(Tk.f23032f, Long.valueOf(jA));
        tk3.a(Tk.f23030d, Long.valueOf(dk2.f22259a));
        tk3.a(Tk.f23034h, Long.valueOf(dk2.f22259a));
        tk3.a(Tk.f23033g, 0L);
        tk3.a(Tk.i, Boolean.TRUE);
        tk3.b();
        this.f23912a.f23286e.a(jA, this.f23915d.f22812a, TimeUnit.MILLISECONDS.toSeconds(dk2.f22260b));
        return new Ck(y42, tk2, a(), new SystemTimeProvider());
    }

    public final Fk a() {
        Ek ek2 = new Ek(this.f23915d);
        ek2.f22304g = this.f23914c.i();
        ek2.f22303f = this.f23914c.f23037c.a(Tk.f23033g);
        ek2.f22301d = this.f23914c.f23037c.a(Tk.f23034h);
        ek2.f22300c = this.f23914c.f23037c.a(Tk.f23032f);
        ek2.f22305h = this.f23914c.f23037c.a(Tk.f23030d);
        ek2.f22298a = this.f23914c.f23037c.a(Tk.f23031e);
        return new Fk(ek2);
    }
}
