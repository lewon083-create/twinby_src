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
import io.sentry.protocol.Device;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vd implements Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18767a;

    public vd(sy syVar) {
        this.f18767a = syVar;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ud deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        sy syVar = this.f18767a;
        ij.p pVar = syVar.m9;
        ij.p pVar2 = syVar.z1;
        ij.p pVar3 = syVar.X2;
        ij.p pVar4 = syVar.T6;
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", yd.f19103l, v0.f18733v);
        Expression optionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", yd.f19104m, v0.f18734w);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, yd.f19110s, yd.f19093a);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", syVar.f18533t1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, A2.f22054g, syVar.F1);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_count", typeHelper, function1, yd.f19111t);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper, function1, yd.f19112u);
        TypeHelper typeHelper2 = yd.f19105n;
        w9 w9Var = w9.f18849x;
        Expression expression = yd.f19094b;
        Expression optionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_content_alignment", typeHelper2, w9Var, expression);
        Expression expression2 = optionalExpression3 == null ? expression : optionalExpression3;
        Expression optionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_spacing", typeHelper, function1, yd.f19113v);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper, function1, yd.f19114w, yd.f19095c);
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", syVar.O2);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", syVar.f18335a3);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", syVar.H3);
        lo loVar = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", pVar4);
        if (loVar == null) {
            loVar = yd.f19096d;
        }
        lo loVar2 = loVar;
        uc ucVar = yd.f19115x;
        Expression expression3 = yd.f19097e;
        Expression optionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper, function1, ucVar, expression3);
        if (optionalExpression5 != null) {
            expression3 = optionalExpression5;
        }
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", syVar.f18530s9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, Device.JsonKeys.ORIENTATION, yd.f19106o, w9.f18850y, yd.f19098f);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, yd.f19099g);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper, function1, yd.f19116y);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_mode", yd.f19107p, w9.f18851z, yd.f19100h);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scrollbar", yd.f19108q, w9.A, yd.i);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", syVar.f18443k1);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", syVar.O8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", kv.f17646g, yd.f19117z);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", syVar.U8);
        JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", syVar.f18341a9);
        JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyNode.JsonKeys.VISIBILITY, yd.f19109r, kv.f17653o, yd.f19101j);
        yw ywVar = (yw) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", pVar);
        List optionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", pVar);
        lo loVar3 = (lo) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", pVar4);
        if (loVar3 == null) {
            loVar3 = yd.f19102k;
        }
        return new ud(optionalExpression, optionalExpression2, expression2, optionalExpression4, optionalList, loVar2, expression3, ywVar, optionalList2, loVar3);
    }
}
