package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q90 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9371a;

    public /* synthetic */ q90(int i) {
        this.f9371a = i;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f9371a) {
            case 0:
                return ti.AD_LOADER;
            case 1:
                return "native";
            case 2:
                return null;
            case 3:
                return new vk0();
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return new nc0();
            case 8:
                return new bd0();
            case 9:
                return new fd0();
            case 10:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new id0(gxVar);
            case 11:
                return new kd0(11, 12, 1007);
            case 12:
                return new kd0(19, 20, 1008);
            case 13:
                return new kd0(13, 14, VKApiCodes.CODE_PHONE_ALREADY_USED);
            case 14:
                return new kd0(1001, 1002, 1003);
            case 15:
                return new kd0(15, 16, 1005);
            case 16:
                return new kd0(17, 18, 1006);
            case 17:
                return new ud0(pr0.SIGNALS, "ttc");
            case 18:
                return new ud0(pr0.PRELOADED_LOADER, "t_load_as");
            case 19:
                return new de0();
            case 20:
                return new te0();
            case 21:
                t9.g0 g0Var = p9.k.C.f31297c;
                String string = UUID.randomUUID().toString();
                gr.G(string);
                return string;
            case 22:
                return new eh0();
            case 23:
                gx gxVar2 = hx.f6279a;
                gr.G(gxVar2);
                return new lk0(gxVar2);
            case 24:
                return new wk0();
            case 25:
                return new ql0();
            case 26:
                gx gxVar3 = hx.f6279a;
                gr.G(gxVar3);
                return new jm0(gxVar3, 0);
            case 27:
                List arrayList = new ArrayList();
                wk wkVar = al.Wc;
                q9.s sVar = q9.s.f31967e;
                if (!((String) sVar.f31970c.a(wkVar)).isEmpty()) {
                    arrayList = Arrays.asList(((String) sVar.f31970c.a(wkVar)).split(StringUtils.COMMA));
                }
                gr.G(arrayList);
                return arrayList;
            case 28:
                gx gxVar4 = hx.f6279a;
                gr.G(gxVar4);
                return new jm0(gxVar4, 1);
            default:
                gx gxVar5 = hx.f6279a;
                gr.G(gxVar5);
                return new jm0(gxVar5, 2);
        }
    }
}
