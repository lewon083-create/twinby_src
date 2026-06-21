package t9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.wk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f33556c;

    public /* synthetic */ c(i iVar, int i) {
        this.f33555b = i;
        this.f33556c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33555b) {
            case 0:
                i iVar = this.f33556c;
                iVar.d(iVar.f33608a);
                return;
            case 1:
                i iVar2 = this.f33556c;
                p9.k kVar = p9.k.C;
                l lVar = kVar.f31308o;
                Context context = iVar2.f33608a;
                String str = iVar2.f33611d;
                String str2 = iVar2.f33612e;
                lVar.getClass();
                wk wkVar = al.J5;
                q9.s sVar = q9.s.f31967e;
                String strJ = l.j(context, lVar.k(context, (String) sVar.f31970c.a(wkVar), str, str2).toString(), str2);
                if (!TextUtils.isEmpty(strJ)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        lVar.f33631f = jSONObject.optString("status");
                        if (((Boolean) sVar.f31970c.a(al.f3229ua)).booleanValue()) {
                            String str3 = lVar.f33631f;
                            boolean z5 = CommonUrlParts.Values.FALSE_INTEGER.equals(str3) || "2".equals(str3);
                            lVar.f(z5);
                            kVar.f31302h.g().f(!z5 ? "" : str);
                        }
                        synchronized (lVar.f33626a) {
                            lVar.f33628c = strOptString;
                            break;
                        }
                        String str4 = lVar.f33631f;
                        if ("2".equals(str4)) {
                            u9.i.c("Creative is not pushed for this device.");
                            lVar.i(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(str4)) {
                            u9.i.c("The app is not linked for creative preview.");
                            lVar.c(context, str, str2);
                            return;
                        } else {
                            if (CommonUrlParts.Values.FALSE_INTEGER.equals(str4)) {
                                u9.i.c("Device is linked for in app preview.");
                                lVar.i(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e3) {
                        u9.i.i("Fail to get in app preview response json.", e3);
                    }
                    break;
                } else {
                    u9.i.c("Not linked for in app preview.");
                }
                lVar.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 2:
                i iVar3 = this.f33556c;
                iVar3.getClass();
                l lVar2 = p9.k.C.f31308o;
                String str5 = iVar3.f33611d;
                String str6 = iVar3.f33612e;
                String str7 = iVar3.f33613f;
                boolean zH = lVar2.h();
                Context context2 = iVar3.f33608a;
                boolean zB = lVar2.b(context2, str5, str6);
                synchronized (lVar2.f33626a) {
                    lVar2.f33629d = zB;
                    break;
                }
                if (!lVar2.h()) {
                    lVar2.c(context2, str5, str6);
                    return;
                }
                if (!zH && !TextUtils.isEmpty(str7)) {
                    lVar2.e(context2, str6, str7, str5);
                }
                u9.i.c("Device is linked for debug signals.");
                lVar2.i(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 3:
                i iVar4 = this.f33556c;
                iVar4.d(iVar4.f33608a);
                return;
            case 4:
                i iVar5 = this.f33556c;
                iVar5.getClass();
                p9.k.C.f31308o.a(iVar5.f33608a);
                return;
            case 5:
                i iVar6 = this.f33556c;
                iVar6.getClass();
                p9.k.C.f31308o.a(iVar6.f33608a);
                return;
            default:
                i iVar7 = this.f33556c;
                iVar7.f33614g = 4;
                iVar7.b();
                return;
        }
    }
}
