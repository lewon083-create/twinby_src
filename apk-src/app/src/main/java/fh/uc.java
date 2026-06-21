package fh;

import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uc implements ListValidator, ValueValidator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18688b;

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.f18688b) {
            case 1:
                return ((String) obj).length() >= 1;
            case 2:
                return ((String) obj).length() >= 1;
            case 3:
                return ((Long) obj).longValue() >= 0;
            case 4:
                return ParsingValidatorsKt.doesMatch((String) obj, "^[a-zA-Z_][a-zA-Z0-9_]*$");
            case 5:
                double dDoubleValue = ((Double) obj).doubleValue();
                return dDoubleValue >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue <= 1.0d;
            case 6:
                return ((Long) obj).longValue() > 0;
            case 7:
                return ((Long) obj).longValue() >= 0;
            case 8:
                return ((Long) obj).longValue() >= 0;
            case 9:
                return ((Long) obj).longValue() >= 0;
            case 10:
                return ((Long) obj).longValue() >= 0;
            case 11:
                return ((Long) obj).longValue() >= 0;
            case 12:
            case 16:
            case 21:
            case 26:
            default:
                return ((Long) obj).longValue() >= 0;
            case 13:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                return dDoubleValue2 >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue2 <= 1.0d;
            case 14:
                return ((Long) obj).longValue() >= 0;
            case 15:
                return ((Long) obj).longValue() >= 0;
            case 17:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                return dDoubleValue3 >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue3 <= 1.0d;
            case 18:
                return ((Long) obj).longValue() >= 0;
            case 19:
                return ((Long) obj).longValue() >= 0;
            case 20:
                return ((Long) obj).longValue() >= 0;
            case 22:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                return dDoubleValue4 >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue4 <= 1.0d;
            case 23:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                return dDoubleValue5 >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue5 <= 1.0d;
            case 24:
                return ((Long) obj).longValue() >= 0;
            case 25:
                return ((Long) obj).longValue() >= 0;
            case 27:
                return ((Double) obj).doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
            case 28:
                double dDoubleValue6 = ((Double) obj).doubleValue();
                return dDoubleValue6 >= ConfigValue.DOUBLE_DEFAULT_VALUE && dDoubleValue6 <= 1.0d;
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        switch (this.f18688b) {
            case 0:
                if (list.size() >= 1) {
                }
                break;
            case 12:
                if (list.size() >= 1) {
                }
                break;
            case 16:
                if (list.size() >= 1) {
                }
                break;
            case 21:
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
