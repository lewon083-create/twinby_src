package l7;

import ad.j0;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.g8;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ob.d0;
import ob.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l.o, m4.o, n2.d, w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f27993c = new b(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b f27994d = new b(13);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b f27995e = new b(14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b f27996f = new b(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b f27997g = new b(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b f27998h = new b(17);
    public static final /* synthetic */ b i = new b(18);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b f27999j = new b(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b f28000k = new b(20);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b f28001l = new b(21);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ b f28002m = new b(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b f28003n = new b(23);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ b f28004o = new b(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b f28005p = new b(25);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ b f28006q = new b(26);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b f28007r = new b(27);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ b f28008s = new b(28);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b f28009t = new b(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28010b;

    public /* synthetic */ b(int i10) {
        this.f28010b = i10;
    }

    public static byte[] d(long j10, j0 j0Var) {
        kf.a aVar = new kf.a(29);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(j0Var.size());
        Iterator<E> it = j0Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) aVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static final boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // l.o
    public boolean c(l.i iVar) {
        return false;
    }

    @Override // ob.w
    public Object h() {
        switch (this.f28010b) {
            case 12:
                return new Boolean(((Boolean) o7.f13910b.b()).booleanValue());
            case 13:
                return new Boolean(((Boolean) g8.f13767a.b()).booleanValue());
            case 14:
                List list = d0.f29996a;
                Boolean bool = (Boolean) q9.f13934a.b();
                bool.getClass();
                return bool;
            case 15:
                List list2 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13806l.b();
            case 16:
                List list3 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.o0.b()).longValue());
            case 17:
                List list4 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13817r.b()).longValue());
            case 18:
                List list5 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.M.b();
            case 19:
                List list6 = d0.f29996a;
                g7.f13765c.get();
                Long l10 = (Long) i7.A.b();
                l10.getClass();
                return l10;
            case 20:
                List list7 = d0.f29996a;
                g7.f13765c.get();
                Long l11 = (Long) i7.L.b();
                l11.getClass();
                return l11;
            case 21:
                List list8 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.O.b()).longValue());
            case 22:
                List list9 = d0.f29996a;
                g7.f13765c.get();
                Long l12 = (Long) i7.Q.b();
                l12.getClass();
                return l12;
            case 23:
                List list10 = d0.f29996a;
                g7.f13765c.get();
                Long l13 = (Long) i7.f13797f0.b();
                l13.getClass();
                return l13;
            case 24:
                List list11 = d0.f29996a;
                g7.f13765c.get();
                Long l14 = (Long) i7.E.b();
                l14.getClass();
                return l14;
            case 25:
                List list12 = d0.f29996a;
                g7.f13765c.get();
                Long l15 = (Long) i7.f13830y.b();
                l15.getClass();
                return l15;
            case 26:
                List list13 = d0.f29996a;
                g7.f13765c.get();
                Long l16 = (Long) i7.f13799g0.b();
                l16.getClass();
                return l16;
            case 27:
                List list14 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13820s0.b()).longValue());
            case 28:
                List list15 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13812o.b()).longValue());
            default:
                List list16 = d0.f29996a;
                g7.f13765c.get();
                Long l17 = (Long) i7.H.b();
                l17.getClass();
                return l17;
        }
    }

    @Override // m4.o
    public void a() {
    }

    @Override // l.o
    public void b(l.i iVar, boolean z5) {
    }
}
