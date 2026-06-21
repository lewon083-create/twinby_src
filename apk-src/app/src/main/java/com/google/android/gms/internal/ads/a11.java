package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f2715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f2717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final js1 f2718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j21 f2719e;

    public a11(Context context, SharedPreferences sharedPreferences, js1 js1Var, j21 j21Var) {
        this.f2717c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        ix.S(dir, false);
        this.f2715a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        ix.S(dir2, true);
        this.f2716b = dir2;
        this.f2718d = js1Var;
        this.f2719e = j21Var;
    }

    public final void a(bz0 bz0Var, byte[] bArr, byte[] bArr2) {
        String strZ = bz0Var.z().z();
        boolean zIsEmpty = TextUtils.isEmpty(strZ);
        j21 j21Var = this.f2719e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.f2716b;
            ix.b0(file);
            file.mkdirs();
            File fileH = ix.H(file, strZ);
            fileH.getClass();
            fileH.mkdirs();
            File fileB = ix.b(strZ, "pcam.jar", file);
            fileB.getClass();
            if (bArr == null || bArr.length <= 0 || ix.C(fileB, bArr)) {
                File fileB2 = ix.b(strZ, "pcbc", file);
                fileB2.getClass();
                if (ix.C(fileB2, bArr2)) {
                    String strZ2 = bz0Var.z().z();
                    if (!TextUtils.isEmpty(strZ2)) {
                        File fileB3 = ix.b(strZ2, "pcam.jar", file);
                        fileB3.getClass();
                        File fileB4 = ix.b(strZ2, "pcbc", file);
                        fileB4.getClass();
                        File fileB5 = ix.b(strZ2, "pcam.jar", c());
                        fileB5.getClass();
                        File fileB6 = ix.b(strZ2, "pcbc", c());
                        fileB6.getClass();
                        if (fileB3.exists() && !fileB3.renameTo(fileB5)) {
                            j21Var.b(15318);
                        } else if (fileB4.exists() && fileB4.renameTo(fileB6)) {
                            bz0 bz0VarB = b(1);
                            SharedPreferences.Editor editorEdit = this.f2717c.edit();
                            if (bz0VarB != null && !bz0Var.z().z().equals(bz0VarB.z().z())) {
                                editorEdit.putString(d(), ua.b.b(bz0VarB.b()));
                            }
                            editorEdit.putString(e(), ua.b.b(bz0Var.b()));
                            if (!editorEdit.commit()) {
                                j21Var.b(15320);
                            }
                        } else {
                            j21Var.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    bz0 bz0VarB2 = b(1);
                    if (bz0VarB2 != null) {
                        hashSet.add(bz0VarB2.z().z());
                    }
                    bz0 bz0VarB3 = b(2);
                    if (bz0VarB3 != null) {
                        hashSet.add(bz0VarB3.z().z());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileH2 = ix.H(c(), name);
                                fileH2.getClass();
                                ix.b0(fileH2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        j21Var.b(15316);
    }

    public final bz0 b(int i) {
        SharedPreferences sharedPreferences = this.f2717c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrM = ua.b.m(string);
                bz0 bz0VarC = bz0.C(bn1.A(bArrM, 0, bArrM.length));
                String strZ = bz0VarC.z().z();
                File fileB = ix.b(strZ, "pcam.jar", c());
                if (fileB == null) {
                    throw null;
                }
                if (!fileB.exists() && (fileB = ix.b(strZ, "pcam", c())) == null) {
                    throw null;
                }
                File fileB2 = ix.b(strZ, "pcbc", c());
                if (fileB2 == null) {
                    throw null;
                }
                if (fileB.exists() && fileB2.exists()) {
                    return bz0VarC;
                }
            } catch (co1 unused) {
                this.f2719e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f2715a, Integer.toString(((ng) this.f2718d.j()).f8295b));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((ng) this.f2718d.j()).f8295b;
        return l7.o.j(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((ng) this.f2718d.j()).f8295b;
        return l7.o.j(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
