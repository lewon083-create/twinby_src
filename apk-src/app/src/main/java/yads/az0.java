package yads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class az0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f36882c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36883a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36884b = -1;

    public final void a(vs1 vs1Var) {
        int i = 0;
        while (true) {
            us1[] us1VarArr = vs1Var.f44117b;
            if (i >= us1VarArr.length) {
                return;
            }
            us1 us1Var = us1VarArr[i];
            if (us1Var instanceof px) {
                px pxVar = (px) us1Var;
                if ("iTunSMPB".equals(pxVar.f42096d) && a(pxVar.f42097e)) {
                    return;
                }
            } else if (us1Var instanceof bd1) {
                bd1 bd1Var = (bd1) us1Var;
                if ("com.apple.iTunes".equals(bd1Var.f36996c) && "iTunSMPB".equals(bd1Var.f36997d) && a(bd1Var.f36998e)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = f36882c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = lb3.f40466a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f36883a = i10;
            this.f36884b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
