package fh;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wq implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18924a;

    public wq(sy syVar) {
        this.f18924a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vq deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18924a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", zq.f19286f, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", zq.f19287g, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, zq.i, zq.f19281a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper, function1, zq.f19289j);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        ij.p pVar4 = syVar.T6;
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = zq.f19282b;
        }
        lo loVar2 = loVar;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, zq.f19283c);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "on_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper, function1, zq.f19290k);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", syVar.f18443k1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, zq.f19291l);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, zq.f19288h, kv.f17653o, zq.f19284d);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = zq.f19285e;
        }
        return new vq(optionalExpression, optionalExpression2, optionalList, loVar2, ywVar, optionalList2, loVar3);
    }
}
