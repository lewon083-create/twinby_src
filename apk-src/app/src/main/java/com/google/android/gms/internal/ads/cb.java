package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f4131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4132d;

    public cb(long j10, String str, String str2, int i) {
        this.f4129a = j10;
        this.f4131c = str;
        this.f4132d = str2;
        this.f4130b = i;
    }

    public static byte[] e(ab abVar, long j10) throws IOException {
        long j11 = abVar.f2828c - abVar.f2829d;
        if (j10 >= 0 && j10 <= j11) {
            int i = (int) j10;
            if (i == j10) {
                byte[] bArr = new byte[i];
                new DataInputStream(abVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(j11).length());
        pe.a.s(sb2, "streamToBytes length=", j10, ", maxLength=");
        sb2.append(j11);
        throw new IOException(sb2.toString());
    }

    public static void f(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int g(ab abVar) {
        return (m(abVar) << 24) | m(abVar) | (m(abVar) << 8) | (m(abVar) << 16);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j10) throws IOException {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static long i(ab abVar) {
        return (((long) m(abVar)) & 255) | ((((long) m(abVar)) & 255) << 8) | ((((long) m(abVar)) & 255) << 16) | ((((long) m(abVar)) & 255) << 24) | ((((long) m(abVar)) & 255) << 32) | ((((long) m(abVar)) & 255) << 40) | ((((long) m(abVar)) & 255) << 48) | ((((long) m(abVar)) & 255) << 56);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String k(ab abVar) {
        return new String(e(abVar, i(abVar)), "UTF-8");
    }

    public static int m(ab abVar) throws IOException {
        int i = abVar.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String n(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized ga a(String str) {
        za zaVar = (za) ((LinkedHashMap) this.f4131c).get(str);
        if (zaVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            ab abVar = new ab(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = za.a(abVar).f12924b;
                if (!TextUtils.equals(str, str2)) {
                    xa.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    za zaVar2 = (za) ((LinkedHashMap) this.f4131c).remove(str);
                    if (zaVar2 != null) {
                        this.f4129a -= zaVar2.f12923a;
                    }
                    return null;
                }
                byte[] bArrE = e(abVar, abVar.f2828c - abVar.f2829d);
                ga gaVar = new ga();
                gaVar.f5719a = bArrE;
                gaVar.f5720b = zaVar.f12925c;
                gaVar.f5721c = zaVar.f12926d;
                gaVar.f5722d = zaVar.f12927e;
                gaVar.f5723e = zaVar.f12928f;
                gaVar.f5724f = zaVar.f12929g;
                List<ka> list = zaVar.f12930h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ka kaVar : list) {
                    treeMap.put(kaVar.f7157a, kaVar.f7158b);
                }
                gaVar.f5725g = treeMap;
                gaVar.f5726h = Collections.unmodifiableList(list);
                return gaVar;
            } finally {
                abVar.close();
            }
        } catch (IOException e3) {
            xa.b("%s: %s", fileD.getAbsolutePath(), e3.toString());
            synchronized (this) {
                boolean zDelete = d(str).delete();
                za zaVar3 = (za) ((LinkedHashMap) this.f4131c).remove(str);
                if (zaVar3 != null) {
                    this.f4129a -= zaVar3.f12923a;
                }
                if (!zDelete) {
                    xa.b("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public synchronized void b(String str, ga gaVar) {
        float f10;
        try {
            long j10 = this.f4129a;
            int length = gaVar.f5719a.length;
            long j11 = j10 + ((long) length);
            int i = this.f4130b;
            float f11 = 0.9f;
            if (j11 <= i || length <= i * 0.9f) {
                File fileD = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                    za zaVar = new za(str, gaVar);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = zaVar.f12925c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, zaVar.f12926d);
                        h(bufferedOutputStream, zaVar.f12927e);
                        h(bufferedOutputStream, zaVar.f12928f);
                        h(bufferedOutputStream, zaVar.f12929g);
                        List<ka> list = zaVar.f12930h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (ka kaVar : list) {
                                j(bufferedOutputStream, kaVar.f7157a);
                                j(bufferedOutputStream, kaVar.f7158b);
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(gaVar.f5719a);
                        bufferedOutputStream.close();
                        zaVar.f12923a = fileD.length();
                        l(str, zaVar);
                        long j12 = this.f4129a;
                        int i10 = this.f4130b;
                        if (j12 >= i10) {
                            boolean z5 = xa.f12090a;
                            if (z5) {
                                xa.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.f4129a;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f4131c).entrySet().iterator();
                            int i11 = 0;
                            while (it.hasNext()) {
                                za zaVar2 = (za) ((Map.Entry) it.next()).getValue();
                                String str3 = zaVar2.f12924b;
                                if (d(str3).delete()) {
                                    f10 = f11;
                                    this.f4129a -= zaVar2.f12923a;
                                } else {
                                    f10 = f11;
                                    xa.b("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.f4129a < i10 * f10) {
                                    break;
                                } else {
                                    f11 = f10;
                                }
                            }
                            if (z5) {
                                xa.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f4129a - j13), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e3) {
                        xa.b("%s", e3.toString());
                        bufferedOutputStream.close();
                        xa.b("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileD.delete()) {
                        xa.b("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!((bb) this.f4132d).h().exists()) {
                        xa.b("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f4131c).clear();
                        this.f4129a = 0L;
                        c();
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void c() {
        File fileH = ((bb) this.f4132d).h();
        if (fileH.exists()) {
            File[] fileArrListFiles = fileH.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        ab abVar = new ab(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            za zaVarA = za.a(abVar);
                            zaVarA.f12923a = length;
                            l(zaVarA.f12924b, zaVarA);
                            abVar.close();
                        } catch (Throwable th2) {
                            abVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileH.mkdirs()) {
            xa.c("Unable to create cache dir %s", fileH.getAbsolutePath());
        }
    }

    public File d(String str) {
        return new File(((bb) this.f4132d).h(), n(str));
    }

    public void l(String str, za zaVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4131c;
        if (linkedHashMap.containsKey(str)) {
            this.f4129a = (zaVar.f12923a - ((za) linkedHashMap.get(str)).f12923a) + this.f4129a;
        } else {
            this.f4129a += zaVar.f12923a;
        }
        linkedHashMap.put(str, zaVar);
    }

    public cb(n90 n90Var) {
        this.f4131c = new LinkedHashMap(16, 0.75f, true);
        this.f4129a = 0L;
        this.f4132d = n90Var;
        this.f4130b = 5242880;
    }

    public cb(File file) {
        this.f4131c = new LinkedHashMap(16, 0.75f, true);
        this.f4129a = 0L;
        this.f4132d = new cf(5, this, file);
        this.f4130b = 20971520;
    }
}
