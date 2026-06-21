package yads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o43 {
    public static String a(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e3) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e3);
                    StringBuilder sbP = com.google.android.gms.internal.ads.om1.p("<", str2, " threw ");
                    sbP.append(e3.getClass().getName());
                    sbP.append(">");
                    string = sbP.toString();
                }
            }
            objArr[i10] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i]);
            i11 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
