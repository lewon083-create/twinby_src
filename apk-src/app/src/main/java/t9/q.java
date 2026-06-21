package t9;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33644c;

    public q() {
        this.f33642a = new ArrayList();
        this.f33643b = new ArrayList();
        this.f33644c = new ArrayList();
    }

    public String a(String str, long j10, int i, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f33643b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.f33642a;
            if (i10 >= size) {
                sb2.append((String) arrayList2.get(arrayList.size()));
                return sb2.toString();
            }
            sb2.append((String) arrayList2.get(i10));
            if (((Integer) arrayList.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i10)).intValue();
                ArrayList arrayList3 = this.f33644c;
                if (iIntValue == 2) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j10)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 3) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i10)).intValue() == 4) {
                    sb2.append(String.format(Locale.US, (String) arrayList3.get(i10), Long.valueOf(j11)));
                }
            }
            i10++;
        }
    }

    public void b(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = this.f33642a;
            int size = arrayList.size();
            arrayList2 = this.f33643b;
            arrayList3 = this.f33644c;
            if (i >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d10));
        arrayList2.add(i, Double.valueOf(d11));
    }

    public q(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f33642a = arrayList;
        this.f33643b = arrayList2;
        this.f33644c = arrayList3;
    }
}
