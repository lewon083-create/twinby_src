package wk;

import d8.e0;
import kotlin.jvm.internal.Intrinsics;
import t.t0;
import uk.s0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements tk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.c f35307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk.c f35308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f35309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f35310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f35311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hi.h f35312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35314h;
    public String i;

    public o(ac.c composer, vk.c json, r mode, o[] oVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f35307a = composer;
        this.f35308b = json;
        this.f35309c = mode;
        this.f35310d = oVarArr;
        this.f35311e = json.f34874b;
        this.f35312f = json.f34873a;
        int iOrdinal = mode.ordinal();
        if (oVarArr != null) {
            o oVar = oVarArr[iOrdinal];
            if (oVar == null && oVar == this) {
                return;
            }
            oVarArr[iOrdinal] = this;
        }
    }

    @Override // tk.c
    public final o a(sk.f descriptor) {
        o oVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        vk.c cVar = this.f35308b;
        r rVarK = j.k(descriptor, cVar);
        char c8 = rVarK.f35323b;
        ac.c cVar2 = this.f35307a;
        cVar2.l(c8);
        cVar2.f738b = true;
        String str = this.f35314h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = descriptor.a();
            }
            cVar2.g();
            n(str);
            cVar2.l(':');
            n(strA);
            this.f35314h = null;
            this.i = null;
        }
        if (this.f35309c == rVarK) {
            return this;
        }
        o[] oVarArr = this.f35310d;
        return (oVarArr == null || (oVar = oVarArr[rVarK.ordinal()]) == null) ? new o(cVar2, cVar, rVarK, oVarArr) : oVar;
    }

    @Override // tk.c
    public final t0 b() {
        return this.f35311e;
    }

    @Override // tk.c
    public final void c() {
        this.f35307a.o("null");
    }

    @Override // tk.c
    public final void d(double d10) {
        boolean z5 = this.f35313g;
        ac.c cVar = this.f35307a;
        if (z5) {
            n(String.valueOf(d10));
        } else {
            ((e0) cVar.f739c).n(String.valueOf(d10));
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw j.a(Double.valueOf(d10), ((e0) cVar.f739c).toString());
        }
    }

    @Override // tk.c
    public final void e(short s10) {
        if (this.f35313g) {
            n(String.valueOf((int) s10));
        } else {
            this.f35307a.p(s10);
        }
    }

    @Override // tk.c
    public final void f(byte b2) {
        if (this.f35313g) {
            n(String.valueOf((int) b2));
        } else {
            this.f35307a.j(b2);
        }
    }

    @Override // tk.c
    public final void g(boolean z5) {
        if (this.f35313g) {
            n(String.valueOf(z5));
        } else {
            ((e0) this.f35307a.f739c).n(String.valueOf(z5));
        }
    }

    @Override // tk.c
    public final void h(float f10) {
        boolean z5 = this.f35313g;
        ac.c cVar = this.f35307a;
        if (z5) {
            n(String.valueOf(f10));
        } else {
            ((e0) cVar.f739c).n(String.valueOf(f10));
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw j.a(Float.valueOf(f10), ((e0) cVar.f739c).toString());
        }
    }

    @Override // tk.c
    public final void i(char c8) {
        n(String.valueOf(c8));
    }

    @Override // tk.c
    public final tk.c j(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean zA = p.a(descriptor);
        r rVar = this.f35309c;
        vk.c cVar = this.f35308b;
        ac.c dVar = this.f35307a;
        if (zA) {
            if (!(dVar instanceof e)) {
                dVar = new e((e0) dVar.f739c, this.f35313g);
            }
            return new o(dVar, cVar, rVar, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && descriptor.equals(vk.m.f34887a)) {
            if (!(dVar instanceof d)) {
                dVar = new d((e0) dVar.f739c, this.f35313g);
            }
            return new o(dVar, cVar, rVar, null);
        }
        if (this.f35314h != null) {
            this.i = descriptor.a();
            return this;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // tk.c
    public final void k(int i) {
        if (this.f35313g) {
            n(String.valueOf(i));
        } else {
            this.f35307a.m(i);
        }
    }

    @Override // tk.c
    public final void l(long j10) {
        if (this.f35313g) {
            n(String.valueOf(j10));
        } else {
            this.f35307a.n(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // tk.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(qk.a r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            vk.c r0 = r4.f35308b
            hi.h r1 = r0.f34873a
            java.lang.Object r1 = r1.f20602g
            vk.a r1 = (vk.a) r1
            boolean r2 = r5 instanceof qk.c
            if (r2 == 0) goto L16
            vk.a r3 = vk.a.f34869b
            if (r1 == r3) goto L4a
            goto L41
        L16:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4a
            r3 = 1
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 != r0) goto L23
            goto L4a
        L23:
            ij.j r5 = new ij.j
            r5.<init>()
            throw r5
        L29:
            sk.f r1 = r5.getDescriptor()
            com.google.android.gms.internal.measurement.h5 r1 = r1.e()
            sk.i r3 = sk.i.f32937b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r1, r3)
            if (r3 != 0) goto L41
            sk.i r3 = sk.i.f32940e
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r3)
            if (r1 == 0) goto L4a
        L41:
            sk.f r1 = r5.getDescriptor()
            java.lang.String r0 = wk.j.e(r1, r0)
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r2 == 0) goto L9c
            qk.c r5 = (qk.c) r5
            if (r6 == 0) goto L7b
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "encoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            t.t0 r5 = r4.b()
            r5.getClass()
            java.lang.String r5 = "baseClass"
            r0 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r5 = 0
            throw r5
        L7b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Value for serializer "
            r6.<init>(r0)
            sk.f r5 = r5.getDescriptor()
            r6.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L9c:
            if (r0 == 0) goto Laa
            sk.f r1 = r5.getDescriptor()
            java.lang.String r1 = r1.a()
            r4.f35314h = r0
            r4.i = r1
        Laa:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk.o.m(qk.a, java.lang.Object):void");
    }

    @Override // tk.c
    public final void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f35307a.q(value);
    }

    @Override // tk.c
    public final void o(sk.f enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        n(enumDescriptor.g(i));
    }

    public final void p(sk.f descriptor, int i, boolean z5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        q(descriptor, i);
        g(z5);
    }

    public final void q(sk.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iOrdinal = this.f35309c.ordinal();
        ac.c cVar = this.f35307a;
        boolean z5 = true;
        if (iOrdinal == 1) {
            if (!cVar.f738b) {
                cVar.l(',');
            }
            cVar.g();
            return;
        }
        if (iOrdinal == 2) {
            if (cVar.f738b) {
                this.f35313g = true;
                cVar.g();
                return;
            }
            if (i % 2 == 0) {
                cVar.l(',');
                cVar.g();
            } else {
                cVar.l(':');
                cVar.r();
                z5 = false;
            }
            this.f35313g = z5;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.f35313g = true;
            }
            if (i == 1) {
                cVar.l(',');
                cVar.r();
                this.f35313g = false;
                return;
            }
            return;
        }
        if (!cVar.f738b) {
            cVar.l(',');
        }
        cVar.g();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        vk.c json = this.f35308b;
        Intrinsics.checkNotNullParameter(json, "json");
        j.j(descriptor, json);
        n(descriptor.g(i));
        cVar.l(':');
        cVar.r();
    }

    public final tk.c r(s0 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        q(descriptor, i);
        return j(descriptor.i(i));
    }

    public final void s(sk.f descriptor, int i, long j10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        q(descriptor, i);
        l(j10);
    }

    public final void t(sk.f descriptor, int i, qk.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f35312f.f20598c) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            q(descriptor, i);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().c()) {
                m(serializer, obj);
            } else if (obj == null) {
                c();
            } else {
                m(serializer, obj);
            }
        }
    }

    public final void u(sk.f descriptor, int i, qk.a serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        q(descriptor, i);
        m(serializer, obj);
    }

    public final void v(sk.f descriptor, int i, String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        q(descriptor, i);
        n(value);
    }

    public final void w(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ac.c cVar = this.f35307a;
        cVar.getClass();
        cVar.f738b = false;
        cVar.l(this.f35309c.f35324c);
    }

    public final boolean x(sk.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return false;
    }
}
