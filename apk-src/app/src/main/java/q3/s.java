package q3;

import ad.o0;
import ad.q1;
import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.measurement.h5;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import t.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f31682j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f31683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f31684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f31685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f31686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f31687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f31688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f31690h;
    public a i;

    public s(File file, q qVar, o3.a aVar) {
        boolean zAdd;
        x1 x1Var = new x1();
        x1Var.f33317b = new HashMap();
        x1Var.f33318c = new SparseArray();
        x1Var.f33319d = new SparseBooleanArray();
        x1Var.f33320e = new SparseBooleanArray();
        l lVar = new l(aVar);
        ci.b bVar = file != null ? new ci.b(new File(file, "cached_content_index.exi")) : null;
        x1Var.f33321f = lVar;
        x1Var.f33322g = bVar;
        g gVar = new g(aVar);
        synchronized (s.class) {
            zAdd = f31682j.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f31683a = file;
        this.f31684b = qVar;
        this.f31685c = x1Var;
        this.f31686d = gVar;
        this.f31687e = new HashMap();
        this.f31688f = new Random();
        this.f31689g = true;
        this.f31690h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new s00(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(s sVar) {
        long j10;
        g gVar = sVar.f31686d;
        x1 x1Var = sVar.f31685c;
        File file = sVar.f31683a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (a e3) {
                sVar.i = e3;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            m3.b.e("SimpleCache", str);
            sVar.i = new a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j10 = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    m3.b.e("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        sVar.f31690h = j10;
        if (j10 == -1) {
            try {
                sVar.f31690h = f(file);
            } catch (IOException e7) {
                String str2 = "Failed to create cache UID: " + file;
                m3.b.f("SimpleCache", str2, e7);
                sVar.i = new a(str2, e7);
                return;
            }
        }
        try {
            x1Var.l(sVar.f31690h);
            if (gVar != null) {
                gVar.c(sVar.f31690h);
                HashMap mapB = gVar.b();
                sVar.i(file, true, fileArrListFiles, mapB);
                gVar.d(mapB.keySet());
            } else {
                sVar.i(file, true, fileArrListFiles, null);
            }
            q1 q1VarO = o0.r(((HashMap) x1Var.f33317b).keySet()).iterator();
            while (q1VarO.hasNext()) {
                x1Var.m((String) q1VarO.next());
            }
            try {
                x1Var.q();
            } catch (IOException e10) {
                m3.b.f("SimpleCache", "Storing index file failed", e10);
            }
        } catch (IOException e11) {
            String str3 = "Failed to initialize cache indices: " + file;
            m3.b.f("SimpleCache", str3, e11);
            sVar.i = new a(str3, e11);
        }
    }

    public static void e(File file) throws a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        m3.b.e("SimpleCache", str);
        throw new a(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, om1.x(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void b(t tVar) {
        String str = tVar.f31657b;
        this.f31685c.h(str).f31667c.add(tVar);
        ArrayList arrayList = (ArrayList) this.f31687e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((q) arrayList.get(size)).b(this, tVar);
            }
        }
        this.f31684b.b(this, tVar);
    }

    public final synchronized void c(String str, g gVar) {
        d();
        x1 x1Var = this.f31685c;
        k kVarH = x1Var.h(str);
        o oVar = kVarH.f31669e;
        o oVarB = oVar.b(gVar);
        kVarH.f31669e = oVarB;
        if (!oVarB.equals(oVar)) {
            ((m) x1Var.f33321f).f(kVarH);
        }
        try {
            this.f31685c.q();
        } catch (IOException e3) {
            throw new a(e3);
        }
    }

    public final synchronized void d() {
        a aVar = this.i;
        if (aVar != null) {
            throw aVar;
        }
    }

    public final synchronized o g(String str) {
        k kVarF;
        kVarF = this.f31685c.f(str);
        return kVarF != null ? kVarF.f31669e : o.f31675c;
    }

    public final t h(long j10, long j11, String str) {
        t tVar;
        long j12;
        k kVarF = this.f31685c.f(str);
        if (kVarF == null) {
            return new t(str, j10, j11, -9223372036854775807L, null);
        }
        while (true) {
            t tVar2 = new t(kVarF.f31666b, j10, -1L, -9223372036854775807L, null);
            TreeSet treeSet = kVarF.f31667c;
            tVar = (t) treeSet.floor(tVar2);
            if (tVar == null || tVar.f31658c + tVar.f31659d <= j10) {
                t tVar3 = (t) treeSet.ceiling(tVar2);
                if (tVar3 != null) {
                    long jMin = tVar3.f31658c - j10;
                    if (j11 != -1) {
                        jMin = Math.min(jMin, j11);
                    }
                    j12 = jMin;
                } else {
                    j12 = j11;
                }
                tVar = new t(kVarF.f31666b, j10, j12, -9223372036854775807L, null);
            }
            if (!tVar.f31660e) {
                break;
            }
            File file = tVar.f31661f;
            file.getClass();
            if (file.length() == tVar.f31659d) {
                break;
            }
            l();
        }
        return tVar;
    }

    public final void i(File file, boolean z5, File[] fileArr, Map map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z5) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z5 && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z5 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                f fVar = map != null ? (f) map.remove(name) : null;
                if (fVar != null) {
                    j10 = fVar.f31651a;
                    j11 = fVar.f31652b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                t tVarB = t.b(file2, j10, j11, this.f31685c);
                if (tVarB != null) {
                    b(tVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(t tVar) {
        k kVarF = this.f31685c.f(tVar.f31657b);
        kVarF.getClass();
        long j10 = tVar.f31658c;
        ArrayList arrayList = kVarF.f31668d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((j) arrayList.get(i)).f31663a == j10) {
                arrayList.remove(i);
                this.f31685c.m(kVarF.f31666b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void k(i iVar) {
        String str = iVar.f31657b;
        long j10 = iVar.f31659d;
        File file = iVar.f31661f;
        x1 x1Var = this.f31685c;
        k kVarF = x1Var.f(str);
        if (kVarF == null || !kVarF.f31667c.remove(iVar)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        g gVar = this.f31686d;
        if (gVar != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) gVar.f31655b).getClass();
                try {
                    ((o3.a) gVar.f31654a).getWritableDatabase().delete((String) gVar.f31655b, "name = ?", new String[]{name});
                } catch (SQLException e3) {
                    throw new androidx.datastore.preferences.protobuf.m(e3);
                }
            } catch (IOException unused) {
                l7.o.s("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        x1Var.m(kVarF.f31666b);
        ArrayList arrayList = (ArrayList) this.f31687e.get(iVar.f31657b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q qVar = (q) arrayList.get(size);
                qVar.f31679b.remove(iVar);
                qVar.f31680c -= j10;
            }
        }
        q qVar2 = this.f31684b;
        qVar2.f31679b.remove(iVar);
        qVar2.f31680c -= j10;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.f31685c.f33317b).values()).iterator();
        while (it.hasNext()) {
            for (i iVar : ((k) it.next()).f31667c) {
                File file = iVar.f31661f;
                file.getClass();
                if (file.length() != iVar.f31659d) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            k((i) arrayList.get(i));
        }
    }

    public final synchronized t m(long j10, long j11, String str) {
        d();
        t tVarH = h(j10, j11, str);
        if (tVarH.f31660e) {
            return n(str, tVarH);
        }
        k kVarH = this.f31685c.h(str);
        long j12 = tVarH.f31659d;
        ArrayList arrayList = kVarH.f31668d;
        for (int i = 0; i < arrayList.size(); i++) {
            j jVar = (j) arrayList.get(i);
            long j13 = jVar.f31663a;
            if (j13 <= j10) {
                long j14 = jVar.f31664b;
                if (j14 == -1 || j13 + j14 > j10) {
                    return null;
                }
            } else {
                if (j12 == -1 || j10 + j12 > j13) {
                    return null;
                }
            }
        }
        arrayList.add(new j(j10, j12));
        return tVarH;
    }

    public final t n(String str, t tVar) {
        boolean z5;
        File file;
        long j10 = tVar.f31659d;
        File file2 = tVar.f31661f;
        if (!this.f31689g) {
            return tVar;
        }
        file2.getClass();
        String name = file2.getName();
        long j11 = tVar.f31659d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = this.f31686d;
        if (gVar != null) {
            try {
                gVar.e(j11, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                m3.b.s("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z5 = false;
        } else {
            z5 = true;
        }
        k kVarF = this.f31685c.f(str);
        kVarF.getClass();
        TreeSet treeSet = kVarF.f31667c;
        h5.r(treeSet.remove(tVar));
        file2.getClass();
        if (z5) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = t.c(parentFile, kVarF.f31665a, tVar.f31658c, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                m3.b.s("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        h5.r(tVar.f31660e);
        t tVar2 = new t(tVar.f31657b, tVar.f31658c, tVar.f31659d, jCurrentTimeMillis, file);
        treeSet.add(tVar2);
        ArrayList arrayList = (ArrayList) this.f31687e.get(tVar.f31657b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                q qVar = (q) arrayList.get(size);
                qVar.f31679b.remove(tVar);
                qVar.f31680c -= j10;
                qVar.b(this, tVar2);
            }
        }
        q qVar2 = this.f31684b;
        qVar2.f31679b.remove(tVar);
        qVar2.f31680c -= j10;
        qVar2.b(this, tVar2);
        return tVar2;
    }
}
