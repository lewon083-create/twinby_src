package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1473c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f1474a = e1.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1475b;

    static {
        new t(0);
    }

    public t() {
    }

    public static void b(n nVar, x1 x1Var, int i, Object obj) {
        if (x1Var == x1.f1505e) {
            nVar.k0(i, 3);
            ((a) obj).b(nVar);
            nVar.k0(i, 4);
        }
        nVar.k0(i, x1Var.f1509c);
        switch (x1Var.ordinal()) {
            case 0:
                nVar.e0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                nVar.c0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                nVar.o0(((Long) obj).longValue());
                break;
            case 3:
                nVar.o0(((Long) obj).longValue());
                break;
            case 4:
                nVar.g0(((Integer) obj).intValue());
                break;
            case 5:
                nVar.e0(((Long) obj).longValue());
                break;
            case 6:
                nVar.c0(((Integer) obj).intValue());
                break;
            case 7:
                nVar.W(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof h)) {
                    nVar.j0((String) obj);
                } else {
                    nVar.a0((h) obj);
                }
                break;
            case 9:
                ((a) obj).b(nVar);
                break;
            case 10:
                a aVar = (a) obj;
                nVar.getClass();
                nVar.m0(((z) aVar).a(null));
                aVar.b(nVar);
                break;
            case 11:
                if (!(obj instanceof h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    nVar.m0(length);
                    nVar.X(bArr, 0, length);
                } else {
                    nVar.a0((h) obj);
                }
                break;
            case 12:
                nVar.m0(((Integer) obj).intValue());
                break;
            case 13:
                nVar.g0(((Integer) obj).intValue());
                break;
            case 14:
                nVar.c0(((Integer) obj).intValue());
                break;
            case 15:
                nVar.e0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                nVar.m0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nVar.o0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1475b) {
            return;
        }
        e1 e1Var = this.f1474a;
        int size = e1Var.f1379b.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = e1Var.c(i);
            if (entryC.getValue() instanceof z) {
                z zVar = (z) entryC.getValue();
                zVar.getClass();
                z0 z0Var = z0.f1519c;
                z0Var.getClass();
                z0Var.a(zVar.getClass()).c(zVar);
                zVar.h();
            }
        }
        if (!e1Var.f1381d) {
            if (e1Var.f1379b.size() > 0) {
                e1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = e1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!e1Var.f1381d) {
            e1Var.f1380c = e1Var.f1380c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e1Var.f1380c);
            e1Var.f1383f = e1Var.f1383f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(e1Var.f1383f);
            e1Var.f1381d = true;
        }
        this.f1475b = true;
    }

    public final Object clone() {
        t tVar = new t();
        e1 e1Var = this.f1474a;
        if (e1Var.f1379b.size() > 0) {
            Map.Entry entryC = e1Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = e1Var.d().iterator();
        if (!it.hasNext()) {
            return tVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f1474a.equals(((t) obj).f1474a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1474a.hashCode();
    }

    public t(int i) {
        a();
        a();
    }
}
