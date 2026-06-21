package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn1 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn1 f9559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sn1 f9560c;

    public qn1(sn1 sn1Var) {
        this.f9559b = sn1Var;
        if (sn1Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9560c = sn1Var.p();
    }

    public static void f(int i, List list) {
        int size = list.size() - i;
        String strL = l7.o.l(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strL);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, kn1 kn1Var) throws co1 {
        int length = bArr.length;
        b();
        try {
            so1.f10369c.a(this.f9560c.getClass()).j(this.f9560c, bArr, 0, length, new um1(kn1Var));
        } catch (co1 e3) {
            throw e3;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.f9560c.h()) {
            return;
        }
        sn1 sn1VarP = this.f9559b.p();
        so1.f10369c.a(sn1VarP.getClass()).b(sn1VarP, this.f9560c);
        this.f9560c = sn1VarP;
    }

    public final sn1 c() {
        if (!this.f9560c.h()) {
            return this.f9560c;
        }
        sn1 sn1Var = this.f9560c;
        sn1Var.getClass();
        so1.f10369c.a(sn1Var.getClass()).a(sn1Var);
        sn1Var.i();
        return this.f9560c;
    }

    public final Object clone() {
        qn1 qn1Var = (qn1) this.f9559b.v(5, null);
        qn1Var.f9560c = c();
        return qn1Var;
    }

    public final sn1 d() {
        sn1 sn1VarC = c();
        sn1VarC.getClass();
        if (sn1.w(sn1VarC, true)) {
            return sn1VarC;
        }
        throw new dp1();
    }

    public final qn1 e(sn1 sn1Var) {
        if (this.f9559b.equals(sn1Var)) {
            return this;
        }
        b();
        sn1 sn1Var2 = this.f9560c;
        so1.f10369c.a(sn1Var2.getClass()).b(sn1Var2, sn1Var);
        return this;
    }
}
