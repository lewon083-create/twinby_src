package fh;

import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ep implements ValueValidator, ListValidator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17165b;

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.f17165b) {
            case 0:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 1:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 2:
            case 8:
            case 9:
            case 15:
            case 18:
            case 21:
            default:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 3:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 4:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 5:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < ConfigValue.DOUBLE_DEFAULT_VALUE || dDoubleValue > 1.0d) {
                }
                break;
            case 6:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 7:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 10:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 11:
                if (((Double) obj).doubleValue() >= ConfigValue.DOUBLE_DEFAULT_VALUE) {
                }
                break;
            case 12:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < ConfigValue.DOUBLE_DEFAULT_VALUE || dDoubleValue2 > 1.0d) {
                }
                break;
            case 13:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 14:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 16:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                if (dDoubleValue3 < ConfigValue.DOUBLE_DEFAULT_VALUE || dDoubleValue3 > 1.0d) {
                }
                break;
            case 17:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 19:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 20:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 22:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 23:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 24:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 25:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 26:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 27:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 28:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                if (dDoubleValue4 < ConfigValue.DOUBLE_DEFAULT_VALUE || dDoubleValue4 > 1.0d) {
                }
                break;
        }
        return false;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        switch (this.f17165b) {
            case 2:
                if (list.size() >= 1) {
                }
                break;
            case 8:
                if (list.size() >= 1) {
                }
                break;
            case 9:
                if (list.size() >= 1) {
                }
                break;
            case 15:
                if (list.size() >= 1) {
                }
                break;
            case 18:
                if (list.size() >= 1) {
                }
                break;
            default:
                if (list.size() >= 1) {
                }
                break;
        }
        return true;
    }
}
