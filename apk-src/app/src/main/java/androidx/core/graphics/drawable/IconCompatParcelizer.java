package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import w6.a;
import w6.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1322a;
        if (aVar.e(1)) {
            i = ((b) aVar).f35166e.readInt();
        }
        iconCompat.f1322a = i;
        byte[] bArr = iconCompat.f1324c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f35166e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1324c = bArr;
        iconCompat.f1325d = aVar.f(iconCompat.f1325d, 3);
        int i11 = iconCompat.f1326e;
        if (aVar.e(4)) {
            i11 = ((b) aVar).f35166e.readInt();
        }
        iconCompat.f1326e = i11;
        int i12 = iconCompat.f1327f;
        if (aVar.e(5)) {
            i12 = ((b) aVar).f35166e.readInt();
        }
        iconCompat.f1327f = i12;
        iconCompat.f1328g = (ColorStateList) aVar.f(iconCompat.f1328g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).f35166e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f1330j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f35166e.readString();
        }
        iconCompat.f1330j = string2;
        iconCompat.f1329h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1322a) {
            case -1:
                Parcelable parcelable = iconCompat.f1325d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1323b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1325d;
                if (parcelable2 != null) {
                    iconCompat.f1323b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1324c;
                iconCompat.f1323b = bArr3;
                iconCompat.f1322a = 3;
                iconCompat.f1326e = 0;
                iconCompat.f1327f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1324c, Charset.forName("UTF-16"));
                iconCompat.f1323b = str;
                if (iconCompat.f1322a == 2 && iconCompat.f1330j == null) {
                    iconCompat.f1330j = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1323b = iconCompat.f1324c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f1329h.name();
        switch (iconCompat.f1322a) {
            case -1:
                iconCompat.f1325d = (Parcelable) iconCompat.f1323b;
                break;
            case 1:
            case 5:
                iconCompat.f1325d = (Parcelable) iconCompat.f1323b;
                break;
            case 2:
                iconCompat.f1324c = ((String) iconCompat.f1323b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1324c = (byte[]) iconCompat.f1323b;
                break;
            case 4:
            case 6:
                iconCompat.f1324c = iconCompat.f1323b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1322a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f35166e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1324c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f35166e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1325d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f35166e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f1326e;
        if (i10 != 0) {
            aVar.h(4);
            ((b) aVar).f35166e.writeInt(i10);
        }
        int i11 = iconCompat.f1327f;
        if (i11 != 0) {
            aVar.h(5);
            ((b) aVar).f35166e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.f1328g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f35166e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f35166e.writeString(str);
        }
        String str2 = iconCompat.f1330j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f35166e.writeString(str2);
        }
    }
}
