package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wp0 implements v43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p20 f44440a = new p20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z43 f44441b = new z43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f44442c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44444e;

    public wp0() {
        for (int i = 0; i < 2; i++) {
            this.f44442c.addFirst(new up0(this));
        }
        this.f44443d = 0;
    }

    @Override // yads.v43
    public final void a(long j10) {
    }

    @Override // yads.oa0
    public final Object b() {
        if (this.f44444e) {
            throw new IllegalStateException();
        }
        if (this.f44443d != 0) {
            return null;
        }
        this.f44443d = 1;
        return this.f44441b;
    }

    @Override // yads.oa0
    public final void flush() {
        if (this.f44444e) {
            throw new IllegalStateException();
        }
        this.f44441b.b();
        this.f44443d = 0;
    }

    @Override // yads.oa0
    public final void release() {
        this.f44444e = true;
    }

    @Override // yads.oa0
    public final Object a() {
        if (this.f44444e) {
            throw new IllegalStateException();
        }
        if (this.f44443d != 2 || this.f44442c.isEmpty()) {
            return null;
        }
        a53 a53Var = (a53) this.f44442c.removeFirst();
        if (this.f44441b.b(4)) {
            a53Var.f43049b |= 4;
        } else {
            z43 z43Var = this.f44441b;
            long j10 = z43Var.f42866f;
            p20 p20Var = this.f44440a;
            ByteBuffer byteBuffer = z43Var.f42864d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            p20Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            vp0 vp0Var = new vp0(j10, yq.a(o20.f41436t, parcelableArrayList));
            a53Var.f43616c = this.f44441b.f42866f;
            a53Var.f36636d = vp0Var;
            a53Var.f36637e = 0L;
        }
        this.f44441b.b();
        this.f44443d = 0;
        return a53Var;
    }

    @Override // yads.oa0
    public final void a(z43 z43Var) {
        if (!this.f44444e) {
            if (this.f44443d == 1) {
                if (this.f44441b == z43Var) {
                    this.f44443d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(a53 a53Var) {
        if (this.f44442c.size() < 2) {
            if (!this.f44442c.contains(a53Var)) {
                a53Var.f43049b = 0;
                a53Var.f36636d = null;
                this.f44442c.addFirst(a53Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
