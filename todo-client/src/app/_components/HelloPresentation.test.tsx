import { render } from '@testing-library/react';

import HelloPresentation from "@/app/_components/HelloPresentation";

describe('ページのテスト', () => {
    test('ページが表示されること', () => {
        const { getByText } = render(<HelloPresentation message={"sample"} />);
        expect(getByText('sample')).toBeInTheDocument();
        expect(getByText('Hello, World')).toBeInTheDocument();
    });
});