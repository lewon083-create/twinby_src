package yads;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yy2 implements nr {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f45196j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f45197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur f45198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls f45199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wr f45200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f45201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f45202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45204h;
    public kr i;

    public yy2(File file, df1 df1Var, ls lsVar, wr wrVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f45197a = file;
        this.f45198b = df1Var;
        this.f45199c = lsVar;
        this.f45200d = wrVar;
        this.f45201e = new HashMap();
        this.f45202f = new Random();
        this.f45203g = true;
        this.f45204h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new xy2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final void a(bz2 bz2Var) {
        this.f45199c.a(bz2Var.f45517b).f39299c.add(bz2Var);
        ArrayList arrayList = (ArrayList) this.f45201e.get(bz2Var.f45517b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                df1 df1Var = (df1) ((ur) arrayList.get(size));
                df1Var.f37749b.add(bz2Var);
                df1Var.f37750c += bz2Var.f45519d;
                df1Var.a(this, 0L);
            }
        }
        df1 df1Var2 = (df1) this.f45198b;
        df1Var2.f37749b.add(bz2Var);
        df1Var2.f37750c += bz2Var.f45519d;
        df1Var2.a(this, 0L);
    }

    public final synchronized long b(String str, long j10, long j11) {
        hs hsVar;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        hsVar = (hs) this.f45199c.f40648a.get(str);
        return hsVar != null ? hsVar.a(j10, j11) : -j11;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((zr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f45199c.f40648a.values()).iterator();
        while (it.hasNext()) {
            for (zr zrVar : ((hs) it.next()).f39299c) {
                if (zrVar.f45521f.length() != zrVar.f45519d) {
                    arrayList.add(zrVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            b((zr) arrayList.get(i));
        }
    }

    public final synchronized jc0 b(String str) {
        jc0 jc0Var;
        try {
            hs hsVar = (hs) this.f45199c.f40648a.get(str);
            if (hsVar != null) {
                jc0Var = hsVar.f39301e;
            } else {
                jc0Var = jc0.f39820c;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jc0Var;
    }

    public final void b() {
        long j10;
        if (!this.f45197a.exists()) {
            try {
                a(this.f45197a);
            } catch (kr e3) {
                this.i = e3;
                return;
            }
        }
        File[] fileArrListFiles = this.f45197a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f45197a;
            kh1.b("SimpleCache", str);
            this.i = new kr(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j10 = -1;
                break;
            }
            File file = fileArrListFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    kh1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.f45204h = j10;
        if (j10 == -1) {
            try {
                this.f45204h = b(this.f45197a);
            } catch (IOException e7) {
                String str2 = "Failed to create cache UID: " + this.f45197a;
                kh1.b("SimpleCache", kh1.a(str2, e7));
                this.i = new kr(str2, e7);
                return;
            }
        }
        try {
            this.f45199c.a(this.f45204h);
            wr wrVar = this.f45200d;
            if (wrVar != null) {
                wrVar.a(this.f45204h);
                HashMap mapA = this.f45200d.a();
                a(this.f45197a, true, fileArrListFiles, mapA);
                this.f45200d.a(mapA.keySet());
            } else {
                a(this.f45197a, true, fileArrListFiles, null);
            }
            ls lsVar = this.f45199c;
            ma3 it = w51.a(lsVar.f40648a.keySet()).iterator();
            while (it.hasNext()) {
                lsVar.b((String) it.next());
            }
            try {
                this.f45199c.a();
            } catch (Throwable th2) {
                kh1.b("SimpleCache", kh1.a("Storing index file failed", th2));
            }
        } catch (Throwable th3) {
            String str3 = "Failed to initialize cache indices: " + this.f45197a;
            kh1.b("SimpleCache", kh1.a(str3, th3));
            this.i = new kr(str3, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, IOException -> 0x0066, blocks: (B:4:0x0005, B:6:0x0014, B:15:0x0043, B:17:0x0048, B:20:0x004e, B:23:0x0062, B:27:0x006f, B:29:0x0081, B:31:0x0088, B:36:0x00e1, B:38:0x00e5, B:40:0x0106, B:42:0x010d, B:43:0x0133, B:47:0x0155, B:48:0x015a, B:34:0x00c4, B:49:0x015b, B:50:0x0160, B:25:0x0066, B:51:0x0161, B:52:0x0169, B:54:0x0171, B:56:0x0181, B:71:0x019e, B:10:0x002b, B:12:0x0033, B:14:0x003f), top: B:76:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0155 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, IOException -> 0x0066, blocks: (B:4:0x0005, B:6:0x0014, B:15:0x0043, B:17:0x0048, B:20:0x004e, B:23:0x0062, B:27:0x006f, B:29:0x0081, B:31:0x0088, B:36:0x00e1, B:38:0x00e5, B:40:0x0106, B:42:0x010d, B:43:0x0133, B:47:0x0155, B:48:0x015a, B:34:0x00c4, B:49:0x015b, B:50:0x0160, B:25:0x0066, B:51:0x0161, B:52:0x0169, B:54:0x0171, B:56:0x0181, B:71:0x019e, B:10:0x002b, B:12:0x0033, B:14:0x003f), top: B:76:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized yads.bz2 c(java.lang.String r21, long r22, long r24) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yy2.c(java.lang.String, long, long):yads.bz2");
    }

    public final synchronized void a(String str, rz rzVar) {
        kr krVar;
        a();
        ls lsVar = this.f45199c;
        hs hsVarA = lsVar.a(str);
        jc0 jc0Var = hsVarA.f39301e;
        jc0 jc0VarA = jc0Var.a(rzVar);
        hsVarA.f39301e = jc0VarA;
        if (!jc0VarA.equals(jc0Var)) {
            lsVar.f40652e.a(hsVarA);
        }
        try {
            this.f45199c.a();
        } finally {
        }
    }

    public yy2(File file, df1 df1Var, kn0 kn0Var) {
        this(file, df1Var, new ls(kn0Var, file), new wr(kn0Var));
    }

    public final synchronized void a() {
        kr krVar = this.i;
        if (krVar != null) {
            throw krVar;
        }
    }

    public static void a(File file) throws kr {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        kh1.b("SimpleCache", str);
        throw new kr(str);
    }

    public final synchronized long a(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jB = b(str, j15, j14 - j15);
            if (jB > 0) {
                j12 += jB;
            } else {
                jB = -jB;
            }
            j15 += jB;
        }
        return j12;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        try {
            hs hsVar = (hs) this.f45199c.f40648a.get(str);
            if (hsVar != null && !hsVar.f39299c.isEmpty()) {
                treeSet = new TreeSet((Collection) hsVar.f39299c);
            } else {
                treeSet = new TreeSet();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return treeSet;
    }

    public final void a(File file, boolean z5, File[] fileArr, HashMap map) {
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
                a(file2, false, file2.listFiles(), map);
            } else if (!z5 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                vr vrVar = map != null ? (vr) map.remove(name) : null;
                if (vrVar != null) {
                    j10 = vrVar.f44114a;
                    j11 = vrVar.f44115b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                bz2 bz2VarA = bz2.a(file2, j10, j11, this.f45199c);
                if (bz2VarA != null) {
                    a(bz2VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void b(zr zrVar) {
        hs hsVar = (hs) this.f45199c.f40648a.get(zrVar.f45517b);
        if (hsVar == null || !hsVar.f39299c.remove(zrVar)) {
            return;
        }
        File file = zrVar.f45521f;
        if (file != null) {
            file.delete();
        }
        if (this.f45200d != null) {
            String name = zrVar.f45521f.getName();
            try {
                wr wrVar = this.f45200d;
                wrVar.f44455b.getClass();
                try {
                    wrVar.f44454a.getWritableDatabase().delete(wrVar.f44455b, "name = ?", new String[]{name});
                } catch (Throwable th2) {
                    throw new v30(th2);
                }
            } catch (IOException unused) {
                rk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f45199c.b(hsVar.f39298b);
        ArrayList arrayList = (ArrayList) this.f45201e.get(zrVar.f45517b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                df1 df1Var = (df1) ((ur) arrayList.get(size));
                df1Var.f37749b.remove(zrVar);
                df1Var.f37750c -= zrVar.f45519d;
            }
        }
        df1 df1Var2 = (df1) this.f45198b;
        df1Var2.f37749b.remove(zrVar);
        df1Var2.f37750c -= zrVar.f45519d;
    }

    public final synchronized void a(zr zrVar) {
        ls lsVar = this.f45199c;
        hs hsVar = (hs) lsVar.f40648a.get(zrVar.f45517b);
        hsVar.getClass();
        long j10 = zrVar.f45518c;
        for (int i = 0; i < hsVar.f39300d.size(); i++) {
            if (((gs) hsVar.f39300d.get(i)).f38860a == j10) {
                hsVar.f39300d.remove(i);
                this.f45199c.b(hsVar.f39298b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, com.google.android.gms.internal.ads.om1.x(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized boolean c(File file) {
        return f45196j.add(file.getAbsoluteFile());
    }
}
