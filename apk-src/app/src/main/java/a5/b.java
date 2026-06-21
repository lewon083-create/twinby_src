package a5;

import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.measurement.b4;
import j3.b0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i) {
        super(18);
        this.f442f = i;
    }

    public static b5.a Z(p pVar) {
        String strU = pVar.u();
        strU.getClass();
        String strU2 = pVar.u();
        strU2.getClass();
        return new b5.a(strU, strU2, pVar.t(), pVar.t(), Arrays.copyOfRange(pVar.f28589a, pVar.f28590b, pVar.f28591c));
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final b0 m(z4.a aVar, ByteBuffer byteBuffer) {
        switch (this.f442f) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                y2 y2Var = new y2(byteBuffer.limit(), byteBuffer.array());
                int i = 12;
                y2Var.t(12);
                int iF = (y2Var.f() + y2Var.i(12)) - 4;
                y2Var.t(44);
                y2Var.u(y2Var.i(12));
                y2Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (y2Var.f() < iF) {
                    y2Var.t(48);
                    int i10 = y2Var.i(8);
                    y2Var.t(4);
                    int iF2 = y2Var.f() + y2Var.i(i);
                    String str = null;
                    String str2 = null;
                    while (y2Var.f() < iF2) {
                        int i11 = y2Var.i(8);
                        int i12 = y2Var.i(8);
                        int iF3 = y2Var.f() + i12;
                        if (i11 == 2) {
                            int i13 = y2Var.i(16);
                            y2Var.t(8);
                            if (i13 == 3) {
                                while (y2Var.f() < iF3) {
                                    int i14 = y2Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    y2Var.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = y2Var.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        y2Var.u(y2Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            y2Var.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        y2Var.q(iF3 * 8);
                    }
                    y2Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new b0(arrayList);
            default:
                return new b0(Z(new p(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
