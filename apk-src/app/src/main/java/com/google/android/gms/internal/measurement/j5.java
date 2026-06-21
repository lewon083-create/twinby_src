package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.um1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j5 implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5 f13839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k5 f13840c;

    public j5(k5 k5Var) {
        this.f13839b = k5Var;
        if (k5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13840c = (k5) k5Var.o(4);
    }

    public static void a(int i, List list) {
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

    public final void b() {
        if (this.f13840c.e()) {
            return;
        }
        k5 k5Var = (k5) this.f13839b.o(4);
        j6.f13841c.a(k5Var.getClass()).b(k5Var, this.f13840c);
        this.f13840c = k5Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j5 clone() {
        j5 j5Var = (j5) this.f13839b.o(5);
        j5Var.f13840c = d();
        return j5Var;
    }

    public final k5 d() {
        if (!this.f13840c.e()) {
            return this.f13840c;
        }
        this.f13840c.g();
        return this.f13840c;
    }

    public final k5 e() {
        k5 k5VarD = d();
        k5VarD.getClass();
        boolean zA = true;
        byte bByteValue = ((Byte) k5VarD.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zA = false;
            } else {
                zA = j6.f13841c.a(k5VarD.getClass()).a(k5VarD);
                k5VarD.o(2);
            }
        }
        if (zA) {
            return k5VarD;
        }
        throw new oc("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(k5 k5Var) {
        k5 k5Var2 = this.f13839b;
        if (k5Var2.equals(k5Var)) {
            return;
        }
        if (!this.f13840c.e()) {
            k5 k5Var3 = (k5) k5Var2.o(4);
            j6.f13841c.a(k5Var3.getClass()).b(k5Var3, this.f13840c);
            this.f13840c = k5Var3;
        }
        k5 k5Var4 = this.f13840c;
        j6.f13841c.a(k5Var4.getClass()).b(k5Var4, k5Var);
    }

    public final void g(byte[] bArr, int i, c5 c5Var) throws t5 {
        if (!this.f13840c.e()) {
            k5 k5Var = (k5) this.f13839b.o(4);
            j6.f13841c.a(k5Var.getClass()).b(k5Var, this.f13840c);
            this.f13840c = k5Var;
        }
        try {
            m6 m6VarA = j6.f13841c.a(this.f13840c.getClass());
            k5 k5Var2 = this.f13840c;
            um1 um1Var = new um1();
            c5Var.getClass();
            m6VarA.g(k5Var2, bArr, 0, i, um1Var);
        } catch (t5 e3) {
            throw e3;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw new t5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
