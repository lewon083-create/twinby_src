package d8;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.View;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.c80;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.dw0;
import com.google.android.gms.internal.ads.ed;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.kh0;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.lq0;
import com.google.android.gms.internal.ads.n90;
import com.google.android.gms.internal.ads.nz;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.t2;
import com.google.android.gms.internal.ads.t61;
import com.google.android.gms.internal.ads.tk0;
import com.google.android.gms.internal.ads.v1;
import com.google.android.gms.internal.ads.xp0;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zs0;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u5;
import com.google.android.gms.internal.play_billing.v5;
import com.google.android.gms.internal.play_billing.w5;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fh.of;
import i4.a1;
import i4.b1;
import io.sentry.protocol.Message;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements h2.q, t2, k81, sb.a, b1, q4.x, u9.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15621d;

    public /* synthetic */ e0(int i, Object obj, int i10) {
        this.f15619b = i10;
        this.f15620c = i;
        this.f15621d = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(d8.e0 r10, ij.b r11, oj.a r12) throws java.lang.Throwable {
        /*
            java.lang.Object r0 = r10.f15621d
            d1.b r0 = (d1.b) r0
            boolean r1 = r12 instanceof wk.m
            if (r1 == 0) goto L17
            r1 = r12
            wk.m r1 = (wk.m) r1
            int r2 = r1.f35299r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f35299r = r2
            goto L1c
        L17:
            wk.m r1 = new wk.m
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f35297p
            nj.a r2 = nj.a.f29512b
            int r3 = r1.f35299r
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 7
            r8 = 4
            r9 = 1
            if (r3 == 0) goto L60
            if (r3 != r9) goto L58
            java.lang.String r10 = r1.f35296o
            java.util.LinkedHashMap r11 = r1.f35295n
            d8.e0 r0 = r1.f35294m
            ij.b r3 = r1.f35293l
            com.google.android.gms.internal.measurement.h5.E(r12)
            vk.l r12 = (vk.l) r12
            r11.put(r10, r12)
            java.lang.Object r10 = r0.f15621d
            d1.b r10 = (d1.b) r10
            byte r10 = r10.h()
            if (r10 == r8) goto L53
            if (r10 != r7) goto L49
            goto La2
        L49:
            java.lang.Object r10 = r0.f15621d
            d1.b r10 = (d1.b) r10
            java.lang.String r11 = "Expected end of the object or comma"
            d1.b.q(r10, r11, r4, r5, r6)
            throw r5
        L53:
            r12 = r10
            r10 = r0
            r0 = r11
            r11 = r3
            goto L72
        L58:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L60:
            com.google.android.gms.internal.measurement.h5.E(r12)
            byte r12 = r0.i(r6)
            byte r3 = r0.w()
            if (r3 == r8) goto Lba
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L72:
            java.lang.Object r3 = r10.f15621d
            d1.b r3 = (d1.b) r3
            boolean r4 = r3.e()
            if (r4 == 0) goto L9f
            java.lang.String r12 = r3.l()
            r4 = 5
            r3.i(r4)
            kotlin.Unit r3 = kotlin.Unit.f27471a
            r1.f35293l = r11
            r1.f35294m = r10
            r1.f35295n = r0
            r1.f35296o = r12
            r1.f35299r = r9
            ij.c r11 = (ij.c) r11
            r11.getClass()
            r11.f21330d = r1
            r11.f21329c = r3
            java.lang.String r10 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
            return r2
        L9f:
            r11 = r0
            r0 = r10
            r10 = r12
        La2:
            java.lang.Object r12 = r0.f15621d
            d1.b r12 = (d1.b) r12
            if (r10 != r6) goto Lac
            r12.i(r7)
            goto Lae
        Lac:
            if (r10 == r8) goto Lb4
        Lae:
            vk.w r10 = new vk.w
            r10.<init>(r11)
            return r10
        Lb4:
            java.lang.String r10 = "object"
            wk.j.h(r12, r10)
            throw r5
        Lba:
            java.lang.String r10 = "Unexpected leading comma"
            d1.b.q(r0, r10, r4, r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.e0.b(d8.e0, ij.b, oj.a):java.lang.Object");
    }

    @Override // i4.b1
    public void a() throws androidx.datastore.preferences.protobuf.m {
        androidx.datastore.preferences.protobuf.m mVar = ((e4.s) this.f15621d).f16190m;
        if (mVar != null) {
            throw mVar;
        }
    }

    @Override // h2.q
    public boolean c(View view) {
        ((BottomSheetBehavior) this.f15621d).z(this.f15620c);
        return true;
    }

    @Override // i4.b1
    public int d(r3.b bVar, r3.e eVar, int i) {
        e4.s sVar = (e4.s) this.f15621d;
        int i10 = this.f15620c;
        if (sVar.f16195r) {
            return -3;
        }
        e4.r rVar = (e4.r) sVar.f16184f.get(i10);
        return rVar.f16176c.C(bVar, eVar, i, rVar.f16177d);
    }

    public void e(int i, int i10) {
        int i11 = i10 + i;
        char[] cArr = (char[]) this.f15621d;
        if (cArr.length <= i11) {
            int i12 = i * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f15621d = cArrCopyOf;
        }
    }

    public vk.l f() throws Throwable {
        vk.l wVar;
        Object obj;
        Object objInvoke;
        d1.b bVar = (d1.b) this.f15621d;
        byte bW = bVar.w();
        if (bW == 1) {
            return m(true);
        }
        if (bW == 0) {
            return m(false);
        }
        if (bW != 6) {
            if (bW == 8) {
                return j();
            }
            d1.b.q(bVar, "Cannot read Json element because of unexpected ".concat(wk.j.m(bW)), 0, null, 6);
            throw null;
        }
        int i = this.f15620c + 1;
        this.f15620c = i;
        if (i == 200) {
            wk.l block = new wk.l(this, null);
            Intrinsics.checkNotNullParameter(block, "block");
            of ofVar = new of();
            Unit unit = Unit.f27471a;
            nj.a aVar = ij.a.f21325a;
            Intrinsics.checkNotNullParameter(ofVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            ij.c cVar = new ij.c(null);
            cVar.f21328b = block;
            cVar.f21329c = unit;
            cVar.f21330d = cVar;
            nj.a aVar2 = ij.a.f21325a;
            cVar.f21331e = aVar2;
            while (true) {
                obj = cVar.f21331e;
                mj.a completion = cVar.f21330d;
                if (completion == null) {
                    break;
                }
                ij.k kVar = ij.m.f21341c;
                if (Intrinsics.a(aVar2, obj)) {
                    try {
                        wk.l lVar = cVar.f21328b;
                        Unit unit2 = cVar.f21329c;
                        if (lVar == null) {
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            Object dVar = context == kotlin.coroutines.g.f27499b ? new nj.d(completion) : new nj.e(context, completion);
                            kotlin.jvm.internal.k0.b(3, lVar);
                            objInvoke = lVar.invoke(cVar, unit2, dVar);
                        } else {
                            kotlin.jvm.internal.k0.b(3, lVar);
                            objInvoke = lVar.invoke(cVar, unit2, completion);
                        }
                        if (objInvoke != nj.a.f29512b) {
                            completion.resumeWith(objInvoke);
                        }
                    } catch (Throwable th2) {
                        ij.k kVar2 = ij.m.f21341c;
                        completion.resumeWith(h5.s(th2));
                    }
                } else {
                    cVar.f21331e = aVar2;
                    completion.resumeWith(obj);
                }
            }
            h5.E(obj);
            wVar = (vk.l) obj;
        } else {
            byte bI = bVar.i((byte) 6);
            if (bVar.w() == 4) {
                d1.b.q(bVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!bVar.e()) {
                    break;
                }
                String strL = bVar.l();
                bVar.i((byte) 5);
                linkedHashMap.put(strL, f());
                bI = bVar.h();
                if (bI != 4) {
                    if (bI != 7) {
                        d1.b.q(bVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bI == 6) {
                bVar.i((byte) 7);
            } else if (bI == 4) {
                wk.j.h(bVar, "object");
                throw null;
            }
            wVar = new vk.w(linkedHashMap);
        }
        this.f15620c--;
        return wVar;
    }

    @Override // sb.a
    public Object g(Task task) {
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        int i = this.f15620c;
        bd bdVar = (bd) this.f15621d;
        dw0 dw0Var = (dw0) task.getResult();
        byte[] bArrB = ((ed) bdVar.d()).b();
        dw0Var.getClass();
        q5 q5Var = new q5(dw0Var, bArrB);
        q5Var.f9333b = i;
        q5Var.a();
        return Boolean.TRUE;
    }

    @Override // i4.b1
    public int h(long j10) {
        e4.s sVar = (e4.s) this.f15621d;
        int i = this.f15620c;
        if (sVar.f16195r) {
            return -3;
        }
        e4.r rVar = (e4.r) sVar.f16184f.get(i);
        a1 a1Var = rVar.f16176c;
        int iV = a1Var.v(j10, rVar.f16177d);
        a1Var.H(iV);
        return iV;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f15619b) {
            case 6:
                int i = this.f15620c;
                a0.u.u(p9.k.C.f31304k, ((qd0) ((cw) this.f15621d).f4350f).f9463e, a0.u.c(i));
                break;
            default:
                lq0 lq0Var = (lq0) this.f15621d;
                String str = (String) obj;
                int i10 = this.f15620c;
                xp0 xp0Var = lq0Var.f7592a;
                if (!xp0Var.f12242i0) {
                    lq0Var.f7594c.b(str, xp0Var.f12271x0, lq0Var.f7596e, null);
                } else {
                    zs0 zs0Var = lq0Var.f7595d;
                    String str2 = lq0Var.f7593b.f13056b;
                    zs0Var.getClass();
                    p9.k.C.f31304k.getClass();
                    cb cbVar = new cb(System.currentTimeMillis(), str2, str, i10);
                    kh0 kh0Var = zs0Var.f13101a;
                    kh0Var.getClass();
                    kh0Var.a(new n90(13, kh0Var, cbVar));
                }
                break;
        }
    }

    @Override // i4.b1
    public boolean isReady() {
        e4.s sVar = (e4.s) this.f15621d;
        int i = this.f15620c;
        if (sVar.f16195r) {
            return false;
        }
        e4.r rVar = (e4.r) sVar.f16184f.get(i);
        return rVar.f16176c.x(rVar.f16177d);
    }

    public vk.e j() {
        d1.b bVar = (d1.b) this.f15621d;
        byte bH = bVar.h();
        if (bVar.w() == 4) {
            d1.b.q(bVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (bVar.e()) {
            arrayList.add(f());
            bH = bVar.h();
            if (bH != 4) {
                boolean z5 = bH == 9;
                int i = bVar.f15507c;
                if (!z5) {
                    d1.b.q(bVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bH == 8) {
            bVar.i((byte) 9);
        } else if (bH == 4) {
            wk.j.h(bVar, "array");
            throw null;
        }
        return new vk.e(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f15619b) {
            case 6:
                break;
            default:
                p9.k.C.f31302h.d("BufferingUrlPinger.attributionReportingManager", th2);
                break;
        }
    }

    public long l(q4.h hVar) {
        m3.p pVar = (m3.p) this.f15621d;
        int i = 0;
        hVar.y(pVar.f28589a, 0, 1, false);
        int i10 = pVar.f28589a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        hVar.y(pVar.f28589a, 1, i12, false);
        while (i < i12) {
            i++;
            i13 = (pVar.f28589a[i] & 255) + (i13 << 8);
        }
        this.f15620c = i12 + 1 + this.f15620c;
        return i13;
    }

    public vk.b0 m(boolean z5) {
        d1.b bVar = (d1.b) this.f15621d;
        String strM = !z5 ? bVar.m() : bVar.l();
        return (z5 || !Intrinsics.a(strM, "null")) ? new vk.q(strM, z5) : vk.t.INSTANCE;
    }

    public void n(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(this.f15620c, length);
        text.getChars(0, text.length(), (char[]) this.f15621d, this.f15620c);
        this.f15620c += length;
    }

    public void o(long j10) {
        n(String.valueOf(j10));
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String p(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        ?? r32 = 0;
        for (int i = 0; i < size; i++) {
            sb2.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i10 = this.f15620c;
        PriorityQueue priorityQueue = new PriorityQueue(i10, new com.google.android.gms.internal.ads.v(6));
        int i11 = 0;
        while (i11 < strArrSplit.length) {
            String[] strArrL = nz.l(strArrSplit[i11], r32);
            if (strArrL.length != 0) {
                int length = strArrL.length;
                if (length < 6) {
                    c80.l(i10, c80.t(length, strArrL), c80.o(strArrL, r32, length), length, priorityQueue);
                } else {
                    long jT = c80.t(6, strArrL);
                    c80.l(i10, jT, c80.o(strArrL, r32, 6), 6, priorityQueue);
                    int i12 = 1;
                    while (true) {
                        int length2 = strArrL.length;
                        if (i12 < length2 - 5) {
                            int iA = nz.a(strArrL[i12 - 1]);
                            int iA2 = nz.a(strArrL[i12 + 5]);
                            int i13 = i12;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strO = c80.o(strArrL, i13, 6);
                            jT = (((((long) iA2) + 2147483647L) % 1073807359) + (((((jT + 1073807359) - ((((((long) iA) + 2147483647L) % 1073807359) * c80.q(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            c80.l(i10, jT, strO, length2, priorityQueue);
                            i12 = i13 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i11++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r32 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((rh) this.f15621d).F1(((sh) it.next()).f10291b));
            } catch (IOException e3) {
                u9.i.f("Error while writing hash to byteStream", e3);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e7) {
            u9.i.f("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e10) {
            u9.i.f("HashManager: Unable to convert to Base64.", e10);
            return "";
        }
    }

    @Override // u9.e
    public /* synthetic */ void q(JsonWriter jsonWriter) throws IOException {
        int i = this.f15620c;
        Map map = (Map) this.f15621d;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        u9.f.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    public void r(int i, byte[] bArr) {
        int i10 = 1777080124;
        int i11 = 1777080124;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c8 = 0;
        int i24 = 0;
        char c9 = 0;
        char c10 = 0;
        while (true) {
            if (i11 == 719824015) {
                int i25 = (-235787554) + i11;
                i11 += 799411447;
                if (i12 == i13) {
                    i11 = i25;
                }
            } else if (i11 == 1519235462) {
                int[] iArr = (int[]) this.f15621d;
                i14 += (((i15 << i16) ^ (i15 >>> i17)) + i15) ^ (i12 + iArr[i12 & i18]);
                i12 += i19;
                i15 += (iArr[(i12 >>> i20) & i18] + i12) ^ (((i14 << i16) ^ (i14 >>> i17)) + i14);
                i11 -= 799411447;
            } else {
                if (i11 != i10) {
                    bArr[0] = (byte) (i14 >> i21);
                    bArr[1] = (byte) ((((i14 >> i22) & i23) << i21) >> i21);
                    bArr[c8] = (byte) ((((i14 >> i24) & i23) << i21) >> i21);
                    bArr[i18] = (byte) (((i14 & i23) << i21) >> i21);
                    bArr[i16] = (byte) (i15 >> i21);
                    bArr[i17] = (byte) ((((i15 >> i22) & i23) << i21) >> i21);
                    bArr[c9] = (byte) ((((i15 >> i24) & i23) << i21) >> i21);
                    bArr[c10] = (byte) (((i15 & i23) << i21) >> i21);
                    return;
                }
                i14 = this.f15620c;
                i11 -= 1057256109;
                i18 = 3;
                i23 = KotlinVersion.MAX_COMPONENT_VALUE;
                c10 = 7;
                c9 = 6;
                c8 = 2;
                i21 = 24;
                i20 = 11;
                i19 = 1340169305;
                i17 = 5;
                i16 = 4;
                i13 = -64255200;
                i22 = 16;
                i24 = 8;
                i15 = i;
                i12 = 0;
            }
            i10 = 1777080124;
        }
    }

    public void s(u5 u5Var) {
        String str;
        i0 i0Var = (i0) this.f15621d;
        int i = this.f15620c;
        try {
            if (i0Var.H == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.h hVar = i0Var.H;
            String packageName = i0Var.F.getPackageName();
            switch (i) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            f0 f0Var = new f0(u5Var);
            com.google.android.gms.internal.play_billing.f fVar = (com.google.android.gms.internal.play_billing.f) hVar;
            Parcel parcelE2 = fVar.e2();
            parcelE2.writeString(packageName);
            parcelE2.writeString(str);
            int i10 = com.google.android.gms.internal.play_billing.e.f14164a;
            parcelE2.writeStrongBinder(f0Var);
            fVar.A2(parcelE2, 1);
        } catch (Exception e3) {
            i0Var.Q(107, 28, n0.E);
            o1.h("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            u5Var.f14334d = true;
            w5 w5Var = u5Var.f14332b;
            if (w5Var != null) {
                v5 v5Var = w5Var.f14355c;
                v5Var.getClass();
                if (t5.f14318g.w(v5Var, null, 0)) {
                    t5.d(v5Var);
                    u5Var.f14331a = null;
                    u5Var.f14332b = null;
                    u5Var.f14333c = null;
                }
            }
        }
    }

    public String toString() {
        switch (this.f15619b) {
            case 3:
                t61 t61Var = (t61) this.f15621d;
                ArrayList arrayList = new ArrayList(t61Var.f10513c);
                int i = 0;
                while (true) {
                    int i10 = t61Var.f10513c;
                    if (i >= i10) {
                        String strX = cq0.x(this.f15620c);
                        String string = arrayList.toString();
                        StringBuilder sb2 = new StringBuilder(pe.a.b(strX.length() + 37, 1, string));
                        sb2.append("UnsupportedBrands{major=");
                        sb2.append(strX);
                        sb2.append(", compatible=");
                        sb2.append(string);
                        sb2.append("}");
                        return sb2.toString();
                    }
                    ix.n0(i, i10);
                    arrayList.add(cq0.x(t61Var.f10512b[i]));
                    i++;
                }
                break;
            case 13:
                dd.a aVar = (dd.a) this.f15621d;
                ArrayList arrayList2 = new ArrayList(aVar.f15770c);
                int i11 = 0;
                while (true) {
                    int i12 = aVar.f15770c;
                    if (i11 >= i12) {
                        return "UnsupportedBrands{major=" + m3.z.X(this.f15620c) + ", compatible=" + arrayList2 + "}";
                    }
                    h5.l(i11, i12);
                    arrayList2.add(m3.z.X(aVar.f15769b[i11]));
                    i11++;
                }
                break;
            case 16:
                return new String((char[]) this.f15621d, 0, this.f15620c);
            default:
                return super.toString();
        }
    }

    public long u(v1 v1Var) {
        int i;
        tk0 tk0Var = (tk0) this.f15621d;
        int i10 = 0;
        v1Var.R(tk0Var.f10641a, 0, 1, false);
        int i11 = tk0Var.f10641a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i;
        }
        int i14 = i11 & (~i12);
        v1Var.R(tk0Var.f10641a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (tk0Var.f10641a[i10] & 255) + (i14 << 8);
        }
        this.f15620c += i;
        return i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int v() {
        Bundle bundle = ((ku) this.f15621d).f7297b.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        return 0;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        return 1;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        return 2;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        return 3;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        return 4;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        return 5;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        return 6;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        return 7;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        return 8;
                    }
                    break;
            }
        }
        return -1;
    }

    public /* synthetic */ e0(Object obj, int i, int i10) {
        this.f15619b = i10;
        this.f15621d = obj;
        this.f15620c = i;
    }

    public e0(int i) {
        this.f15619b = 5;
        this.f15621d = new rh(2);
        this.f15620c = i;
    }

    public e0(int i, byte b2) {
        this.f15619b = i;
        switch (i) {
            case 12:
                this.f15621d = new m3.p(8);
                break;
            case 16:
                break;
            default:
                this.f15621d = new tk0(8);
                break;
        }
    }

    public e0(int i, int i10, int[] iArr) {
        dd.a aVar;
        t61 t61Var;
        this.f15619b = i10;
        switch (i10) {
            case 4:
                int length = iArr.length;
                if (length == 4) {
                    this.f15620c = i;
                    this.f15621d = iArr;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder(pe.a.a(length, 44));
                    sb2.append(zb.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb2.append(length);
                    sb2.append(zb.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 13:
                this.f15620c = i;
                if (iArr != null) {
                    dd.a aVar2 = dd.a.f15768d;
                    aVar = iArr.length == 0 ? dd.a.f15768d : new dd.a(Arrays.copyOf(iArr, iArr.length));
                } else {
                    aVar = dd.a.f15768d;
                }
                this.f15621d = aVar;
                return;
            default:
                this.f15620c = i;
                if (iArr != null) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                    t61Var = new t61(iArrCopyOf.length, iArrCopyOf);
                } else {
                    t61Var = t61.f10511d;
                }
                this.f15621d = t61Var;
                return;
        }
    }

    public e0(hi.h configuration, d1.b lexer) {
        this.f15619b = 17;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f15621d = lexer;
    }

    private final void t(Throwable th2) {
    }
}
