package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.i4 f10296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok f10297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10298c;

    public si() {
        this.f10297b = pk.K();
        this.f10298c = false;
        this.f10296a = new com.google.android.gms.internal.measurement.i4(6);
    }

    public final synchronized void a(ri riVar) {
        if (this.f10298c) {
            try {
                riVar.b(this.f10297b);
            } catch (NullPointerException e3) {
                p9.k.C.f31302h.d("AdMobClearcutLogger.modify", e3);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f10298c) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.V5)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        ok okVar = this.f10297b;
        okVar.b();
        ((pk) okVar.f9560c).E();
        ArrayList arrayListI = t9.g0.I();
        okVar.b();
        ((pk) okVar.f9560c).D(arrayListI);
        byte[] bArrB = ((pk) okVar.d()).b();
        com.google.android.gms.internal.measurement.i4 i4Var = this.f10296a;
        ya yaVar = new ya();
        Objects.requireNonNull(i4Var);
        yaVar.f12557d = i4Var;
        yaVar.f12556c = bArrB;
        int i10 = i - 1;
        yaVar.f12555b = i10;
        synchronized (yaVar) {
            ((ExecutorService) ((com.google.android.gms.internal.measurement.i4) yaVar.f12557d).f13783d).execute(new s(11, yaVar));
        }
        t9.c0.m("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        t9.c0.m("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                t9.c0.m("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    t9.c0.m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            t9.c0.m("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb2;
        ok okVar = this.f10297b;
        String strJ = ((pk) okVar.f9560c).J();
        p9.k.C.f31304k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((pk) okVar.d()).b(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strJ);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public si(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f10297b = pk.K();
        this.f10296a = i4Var;
        this.f10298c = ((Boolean) q9.s.f31967e.f31970c.a(al.U5)).booleanValue();
    }
}
