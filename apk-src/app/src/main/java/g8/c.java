package g8;

import androidx.lifecycle.q0;
import androidx.lifecycle.w;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import ob.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f20016h;

    public c(o6.g owner, q0 onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f20012d = owner;
        this.f20013e = onAttach;
        this.f20014f = new z(23);
        this.f20015g = new LinkedHashMap();
        this.f20011c = true;
    }

    public void a() {
        o6.g gVar = (o6.g) this.f20012d;
        if (((w) gVar.getLifecycle()).f1606c != androidx.lifecycle.o.f1574c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f20009a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((q0) this.f20013e).invoke();
        gVar.getLifecycle().a(new d.e(2, this));
        this.f20009a = true;
    }

    public c(String str, String str2, String str3, d8.a aVar, boolean z5, boolean z10, boolean z11, Integer num) {
        this.f20012d = str;
        this.f20013e = str2;
        this.f20014f = str3;
        this.f20015g = aVar;
        this.f20009a = z5;
        this.f20010b = z10;
        this.f20011c = z11;
        this.f20016h = num;
    }
}
