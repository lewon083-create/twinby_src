package l6;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements q6.c, Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f27980j = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f27981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f27982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f27983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f27984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f27985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f27986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f27987h;
    public int i;

    public j(int i) {
        this.f27987h = i;
        int i10 = i + 1;
        this.f27986g = new int[i10];
        this.f27982c = new long[i10];
        this.f27983d = new double[i10];
        this.f27984e = new String[i10];
        this.f27985f = new byte[i10][];
    }

    public static j d(int i, String str) {
        TreeMap treeMap = f27980j;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    j jVar = new j(i);
                    jVar.f27981b = str;
                    jVar.i = i;
                    return jVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                j jVar2 = (j) entryCeilingEntry.getValue();
                jVar2.f27981b = str;
                jVar2.i = i;
                return jVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q6.c
    public final void a(r6.b bVar) {
        for (int i = 1; i <= this.i; i++) {
            int i10 = this.f27986g[i];
            if (i10 == 1) {
                bVar.d(i);
            } else if (i10 == 2) {
                bVar.b(i, this.f27982c[i]);
            } else if (i10 == 3) {
                ((SQLiteProgram) bVar.f32252c).bindDouble(i, this.f27983d[i]);
            } else if (i10 == 4) {
                bVar.h(i, this.f27984e[i]);
            } else if (i10 == 5) {
                bVar.a(i, this.f27985f[i]);
            }
        }
    }

    @Override // q6.c
    public final String b() {
        return this.f27981b;
    }

    public final void h(int i, long j10) {
        this.f27986g[i] = 2;
        this.f27982c[i] = j10;
    }

    public final void i(int i) {
        this.f27986g[i] = 1;
    }

    public final void j(int i, String str) {
        this.f27986g[i] = 4;
        this.f27984e[i] = str;
    }

    public final void k() {
        TreeMap treeMap = f27980j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f27987h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
