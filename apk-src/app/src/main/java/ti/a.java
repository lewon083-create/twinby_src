package ti;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import com.google.android.gms.internal.ads.r9;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ii.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f33792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33793b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d8.a f33794c;

    public a(Context context, d8.a aVar) {
        this.f33792a = context;
        this.f33794c = aVar;
    }

    @Override // ii.w
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        t tVar = this.f33793b;
        d8.a aVar = this.f33794c;
        switch (b2) {
            case -128:
                return new y(new k9.h(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue()));
            case -127:
                List list = (List) readValueOfType(byteBuffer.get(), byteBuffer);
                String str = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                Object valueOfType = readValueOfType(byteBuffer.get(), byteBuffer);
                return new s(list, str, valueOfType != null ? (Boolean) valueOfType : null, (List) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), aVar.b(), (List) readValueOfType(byteBuffer.get(), byteBuffer));
            case -126:
                return new v(k9.h.f27261k);
            case -125:
            case -109:
            default:
                return super.readValueOfType(b2, byteBuffer);
            case -124:
                return new n0((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -123:
                return new g(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (i) readValueOfType(byteBuffer.get(), byteBuffer));
            case -122:
                return new n((List) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (List) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), aVar.b(), (List) readValueOfType(byteBuffer.get(), byteBuffer));
            case -121:
                String str2 = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                str2.getClass();
                if (str2.equals("ready")) {
                    return z.f33918c;
                }
                if (str2.equals("notReady")) {
                    return z.f33917b;
                }
                throw new IllegalArgumentException("Unable to handle state: ".concat(str2));
            case -120:
                return new a0((z) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Number) readValueOfType(byteBuffer.get(), byteBuffer));
            case -119:
                return new g0((Map) readValueOfType(byteBuffer.get(), byteBuffer));
            case -118:
                return new r0((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -117:
                return new e(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -116:
                return new i((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (List) readValueOfType(byteBuffer.get(), byteBuffer), (f) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer));
            case -115:
                return new f((String) readValueOfType(byteBuffer.get(), byteBuffer), ((Long) readValueOfType(byteBuffer.get(), byteBuffer)).longValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), (e) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -114:
                return new u(this.f33792a, tVar, (String) readValueOfType(byteBuffer.get(), byteBuffer), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new x(k9.h.f27260j);
            case -112:
                return new l0((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (s0) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case -111:
                return new s0((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case -110:
                return new w(tVar, this.f33792a, ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -108:
                r9 r9Var = new r9();
                ArrayList arrayList = (ArrayList) r9Var.f9764e;
                r9Var.c((String) readValueOfType(byteBuffer.get(), byteBuffer));
                r9Var.d(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                r9Var.e(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                List list2 = (List) readValueOfType(byteBuffer.get(), byteBuffer);
                arrayList.clear();
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                return new k9.q(r9Var.f9761b, r9Var.f9762c, r9Var.f9760a, arrayList, r9Var.f9763d);
            case -107:
                return new ui.b((ui.d) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (ui.c) readValueOfType(byteBuffer.get(), byteBuffer), (ui.c) readValueOfType(byteBuffer.get(), byteBuffer), (ui.c) readValueOfType(byteBuffer.get(), byteBuffer), (ui.c) readValueOfType(byteBuffer.get(), byteBuffer));
            case -106:
                return new ui.c((ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (ui.a) readValueOfType(byteBuffer.get(), byteBuffer), (Double) readValueOfType(byteBuffer.get(), byteBuffer));
            case -105:
                int iIntValue = ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue();
                if (iIntValue >= 0 && iIntValue < ui.a.values().length) {
                    return ui.a.values()[iIntValue];
                }
                Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + iIntValue);
                return ui.a.f34477b;
            case -104:
                int iIntValue2 = ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < ui.d.values().length) {
                    return ui.d.values()[iIntValue2];
                }
                Log.w("NativeTemplateType", "Invalid template type index: " + iIntValue2);
                return ui.d.MEDIUM;
            case -103:
                return new ColorDrawable(Color.argb(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue()));
            case -102:
                String str3 = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                try {
                    a0.u.q(Class.forName(str3).getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (ClassNotFoundException unused) {
                    Log.e("FlutterMediationExtras", "Class not found: " + str3);
                    return null;
                } catch (IllegalAccessException unused2) {
                    Log.e("FlutterMediationExtras", "Illegal Access to " + str3);
                    return null;
                } catch (InstantiationException unused3) {
                    Log.e("FlutterMediationExtras", "Unable to instantiate class " + str3);
                    return null;
                } catch (NoSuchMethodException unused4) {
                    Log.e("FlutterMediationExtras", "No such method found: " + str3 + ".getDeclaredConstructor()");
                    return null;
                } catch (InvocationTargetException unused5) {
                    Log.e("FlutterMediationExtras", "Invocation Target Exception for: " + str3);
                    return null;
                }
        }
    }

    @Override // ii.w
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (yVar instanceof w) {
                w wVar = (w) yVar;
                byteArrayOutputStream.write(-110);
                writeValue(byteArrayOutputStream, Integer.valueOf(wVar.f33915b));
                writeValue(byteArrayOutputStream, wVar.f33910e);
                writeValue(byteArrayOutputStream, wVar.f33909d);
                return;
            }
            if (yVar instanceof u) {
                byteArrayOutputStream.write(-114);
                u uVar = (u) yVar;
                writeValue(byteArrayOutputStream, uVar.f33899d);
                writeValue(byteArrayOutputStream, Integer.valueOf(uVar.f33915b));
                return;
            }
            if (yVar instanceof x) {
                byteArrayOutputStream.write(-113);
                return;
            } else {
                if (yVar instanceof v) {
                    byteArrayOutputStream.write(-126);
                    return;
                }
                byteArrayOutputStream.write(-128);
                writeValue(byteArrayOutputStream, Integer.valueOf(yVar.f33915b));
                writeValue(byteArrayOutputStream, Integer.valueOf(yVar.f33916c));
                return;
            }
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(-122);
            n nVar = (n) obj;
            writeValue(byteArrayOutputStream, nVar.f33885a);
            writeValue(byteArrayOutputStream, nVar.f33886b);
            writeValue(byteArrayOutputStream, nVar.f33855j);
            writeValue(byteArrayOutputStream, nVar.f33856k);
            writeValue(byteArrayOutputStream, nVar.f33887c);
            writeValue(byteArrayOutputStream, nVar.f33888d);
            writeValue(byteArrayOutputStream, nVar.f33889e);
            writeValue(byteArrayOutputStream, nVar.f33857l);
            writeValue(byteArrayOutputStream, nVar.f33890f);
            writeValue(byteArrayOutputStream, nVar.f33891g);
            writeValue(byteArrayOutputStream, nVar.i);
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(-127);
            s sVar = (s) obj;
            writeValue(byteArrayOutputStream, sVar.f33885a);
            writeValue(byteArrayOutputStream, sVar.f33886b);
            writeValue(byteArrayOutputStream, sVar.f33887c);
            writeValue(byteArrayOutputStream, sVar.f33888d);
            writeValue(byteArrayOutputStream, sVar.f33889e);
            writeValue(byteArrayOutputStream, sVar.f33890f);
            writeValue(byteArrayOutputStream, sVar.f33891g);
            writeValue(byteArrayOutputStream, sVar.i);
            return;
        }
        if (obj instanceof n0) {
            byteArrayOutputStream.write(-124);
            n0 n0Var = (n0) obj;
            writeValue(byteArrayOutputStream, n0Var.f33858a);
            writeValue(byteArrayOutputStream, n0Var.f33859b);
            return;
        }
        if (obj instanceof f) {
            byteArrayOutputStream.write(-115);
            f fVar = (f) obj;
            writeValue(byteArrayOutputStream, fVar.f33811a);
            writeValue(byteArrayOutputStream, Long.valueOf(fVar.f33812b));
            writeValue(byteArrayOutputStream, fVar.f33813c);
            writeValue(byteArrayOutputStream, fVar.f33814d);
            writeValue(byteArrayOutputStream, fVar.f33815e);
            writeValue(byteArrayOutputStream, fVar.f33816f);
            writeValue(byteArrayOutputStream, fVar.f33817g);
            writeValue(byteArrayOutputStream, fVar.f33818h);
            writeValue(byteArrayOutputStream, fVar.i);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(-116);
            i iVar = (i) obj;
            writeValue(byteArrayOutputStream, iVar.f33827a);
            writeValue(byteArrayOutputStream, iVar.f33828b);
            writeValue(byteArrayOutputStream, iVar.f33829c);
            writeValue(byteArrayOutputStream, iVar.f33830d);
            writeValue(byteArrayOutputStream, iVar.f33831e);
            return;
        }
        if (obj instanceof g) {
            byteArrayOutputStream.write(-123);
            g gVar = (g) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(gVar.f33821a));
            writeValue(byteArrayOutputStream, gVar.f33822b);
            writeValue(byteArrayOutputStream, gVar.f33823c);
            writeValue(byteArrayOutputStream, gVar.f33824d);
            return;
        }
        if (obj instanceof e) {
            byteArrayOutputStream.write(-117);
            e eVar = (e) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(eVar.f33807a));
            writeValue(byteArrayOutputStream, eVar.f33808b);
            writeValue(byteArrayOutputStream, eVar.f33809c);
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(-121);
            z zVar = (z) obj;
            int iOrdinal = zVar.ordinal();
            if (iOrdinal == 0) {
                writeValue(byteArrayOutputStream, "notReady");
                return;
            } else if (iOrdinal == 1) {
                writeValue(byteArrayOutputStream, "ready");
                return;
            } else {
                throw new IllegalArgumentException("Unable to handle state: " + zVar);
            }
        }
        if (obj instanceof a0) {
            byteArrayOutputStream.write(-120);
            a0 a0Var = (a0) obj;
            writeValue(byteArrayOutputStream, a0Var.f33795a);
            writeValue(byteArrayOutputStream, a0Var.f33796b);
            writeValue(byteArrayOutputStream, a0Var.f33797c);
            return;
        }
        if (obj instanceof g0) {
            byteArrayOutputStream.write(-119);
            writeValue(byteArrayOutputStream, ((g0) obj).f33825a);
            return;
        }
        if (obj instanceof r0) {
            byteArrayOutputStream.write(-118);
            r0 r0Var = (r0) obj;
            writeValue(byteArrayOutputStream, r0Var.f33883a);
            writeValue(byteArrayOutputStream, r0Var.f33884b);
            return;
        }
        if (obj instanceof l0) {
            byteArrayOutputStream.write(-112);
            l0 l0Var = (l0) obj;
            writeValue(byteArrayOutputStream, l0Var.f33847a);
            writeValue(byteArrayOutputStream, l0Var.f33848b);
            writeValue(byteArrayOutputStream, l0Var.f33849c);
            writeValue(byteArrayOutputStream, l0Var.f33850d);
            writeValue(byteArrayOutputStream, l0Var.f33851e);
            writeValue(byteArrayOutputStream, l0Var.f33852f);
            return;
        }
        if (obj instanceof k9.q) {
            byteArrayOutputStream.write(-108);
            k9.q qVar = (k9.q) obj;
            String str = qVar.f27278c;
            if (str == null) {
                str = "";
            }
            writeValue(byteArrayOutputStream, str);
            writeValue(byteArrayOutputStream, Integer.valueOf(qVar.f27276a));
            writeValue(byteArrayOutputStream, Integer.valueOf(qVar.f27277b));
            writeValue(byteArrayOutputStream, new ArrayList(qVar.f27279d));
            return;
        }
        if (obj instanceof s0) {
            byteArrayOutputStream.write(-111);
            s0 s0Var = (s0) obj;
            writeValue(byteArrayOutputStream, s0Var.f33893a);
            writeValue(byteArrayOutputStream, s0Var.f33894b);
            writeValue(byteArrayOutputStream, s0Var.f33895c);
            return;
        }
        if (obj instanceof ui.b) {
            byteArrayOutputStream.write(-107);
            ui.b bVar = (ui.b) obj;
            writeValue(byteArrayOutputStream, bVar.f34479a);
            writeValue(byteArrayOutputStream, bVar.f34480b);
            writeValue(byteArrayOutputStream, bVar.f34481c);
            writeValue(byteArrayOutputStream, bVar.f34482d);
            writeValue(byteArrayOutputStream, bVar.f34483e);
            writeValue(byteArrayOutputStream, bVar.f34484f);
            return;
        }
        if (obj instanceof ui.a) {
            byteArrayOutputStream.write(-105);
            writeValue(byteArrayOutputStream, Integer.valueOf(((ui.a) obj).ordinal()));
            return;
        }
        if (obj instanceof ui.d) {
            byteArrayOutputStream.write(-104);
            writeValue(byteArrayOutputStream, Integer.valueOf(((ui.d) obj).ordinal()));
            return;
        }
        if (obj instanceof ui.c) {
            byteArrayOutputStream.write(-106);
            ui.c cVar = (ui.c) obj;
            writeValue(byteArrayOutputStream, cVar.f34485a);
            writeValue(byteArrayOutputStream, cVar.f34486b);
            writeValue(byteArrayOutputStream, cVar.f34487c);
            writeValue(byteArrayOutputStream, cVar.a());
            return;
        }
        if (!(obj instanceof ColorDrawable)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(-103);
        int color = ((ColorDrawable) obj).getColor();
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
    }
}
