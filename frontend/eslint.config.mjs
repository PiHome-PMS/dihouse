import next from 'eslint-config-next';

const config = [
    {
        ignores: [
            '**/node_modules/**',
            '**/.next/**',
            '**/out/**',
            '**/build/**',
            '**/.turbo/**',
            'next-env.d.ts',
        ],
    },
    ...next,
];

export default config;
