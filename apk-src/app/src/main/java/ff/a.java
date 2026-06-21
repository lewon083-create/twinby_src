package ff;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.account.AccountService;
import com.vk.sdk.api.pages.PagesService;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, ValueValidator, ListValidator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16786b;

    public /* synthetic */ a(int i) {
        this.f16786b = i;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.f16786b) {
            case 12:
                return ((Long) obj).longValue() >= 0;
            case 13:
                return ((Long) obj).longValue() >= 0;
            case 14:
                return ((Long) obj).longValue() >= 0;
            case 15:
                return ((Long) obj).longValue() >= 0;
            case 16:
                return ((Long) obj).longValue() >= 0;
            case 17:
                return ((Long) obj).longValue() >= 0;
            case 18:
                return ParsingValidatorsKt.doesMatch((String) obj, "^(?!/)(.+)(?<!/)$");
            case 19:
                return ((Long) obj).longValue() >= 0;
            case 20:
                return ((Long) obj).longValue() >= 0;
            case 21:
            default:
                return ((Long) obj).longValue() >= 0;
            case 22:
                return ((Double) obj).doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE;
            case 23:
                return ((Long) obj).longValue() >= 0;
            case 24:
                return ((Long) obj).longValue() >= 0;
            case 25:
                return ((Long) obj).longValue() >= 0;
            case 26:
                return ((Long) obj).longValue() >= 0;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f16786b) {
            case 0:
                return AccountService.m41accountGetInfo$lambda23(pVar);
            case 1:
                return AccountService.m51accountUnban$lambda73(pVar);
            case 2:
                return AccountService.m44accountRegisterDevice$lambda31(pVar);
            case 3:
                return AccountService.m48accountSetOnline$lambda59(pVar);
            case 4:
                return PagesService.m401pagesParseWiki$lambda23(pVar);
            case 5:
                return PagesService.m402pagesSave$lambda26(pVar);
            case 6:
                return PagesService.m396pagesClearCache$lambda0(pVar);
            case 7:
                return PagesService.m397pagesGet$lambda2(pVar);
            case 8:
                return PagesService.m400pagesGetVersion$lambda18(pVar);
            case 9:
                return PagesService.m403pagesSaveAccess$lambda33(pVar);
            case 10:
                return PagesService.m398pagesGetHistory$lambda11(pVar);
            default:
                return PagesService.m399pagesGetTitles$lambda15(pVar);
        }
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        switch (this.f16786b) {
            case 21:
                if (list.size() >= 1) {
                }
                break;
            case 27:
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
