package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tt implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18663a;

    public tt(sy syVar) {
        this.f18663a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qt resolve(ParsingContext parsingContext, vt vtVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveExpression(parsingContext, vtVar.f18804a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, vtVar.f18805b, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, ut.f18715d, ut.f18712a);
        Field field = vtVar.f18806c;
        TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
        Function1<Object, Boolean> function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
        JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_animated", typeHelper, function1, ut.f18713b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, vtVar.f18807d, jSONObject, "is_enabled", typeHelper, function1, ut.f18714c);
        Field field2 = vtVar.f18808e;
        sy syVar = this.f18663a;
        return new qt();
    }
}
